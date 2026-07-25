package P55

/*
P55 (**) Construct completely balanced binary trees.
In a completely balanced binary tree, the following property holds for every node: The number of nodes in its left subtree and the number of nodes in its right subtree are almost equal, which means their difference is not greater than one.

Define an object named Tree.  Write a function Tree.cBalanced to construct completely balanced binary trees for a given number of nodes.  The function should generate all solutions.  The function should take as parameters the number of nodes and a single value to put in all of them.

scala> Tree.cBalanced(4, "x")
res0: List(Node[String]) = List(T(x T(x . .) T(x . T(x . .))), T(x T(x . .) T(x T(x . .) .)), ...
 */

class P55_impl_1 {

    sealed abstract class Tree[+T]

    case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
        override def toString: String = "T(" + value + " " + left + " " + right + ")"
    }

    case object End extends Tree[Nothing] {
        override def toString: String = "."
    }

    object Node {
        def apply[T](value: T): Node[T] =
            new Node(value, End, End)
    }

    def cBalanced[T](nodes: Int, value: T): List[Tree[T]] = {
        if (nodes == 0) {
            return List(End)
        }
        if (nodes == 1) {
            return List(Node(value))
        }
        val leftNodes = (nodes - 1) / 2
        val rightNodes = (nodes - 1) - leftNodes
        var result = List.empty[Tree[T]]

        if (leftNodes == rightNodes) {

            val leftTrees = cBalanced(leftNodes, value)
            val rightTrees = cBalanced(rightNodes, value)
            for (left <- leftTrees) {
                for (right <- rightTrees) {
                    result = result :+ Node(value, left, right)
                }
            }

        } else {

            val smallTrees = cBalanced(leftNodes, value)
            val largeTrees = cBalanced(rightNodes, value)
            for (left <- smallTrees) {
                for (right <- largeTrees) {
                    result = result :+ Node(value, left, right)
                }
            }

            for (left <- largeTrees) {
                for (right <- smallTrees) {
                    result = result :+ Node(value, left, right)
                }
            }
        }

        result
    }
}

@main
def P55Impl1(): Unit = {

    val dpk055 = new P55_impl_1

    println(dpk055.cBalanced(4, "x"))
}
