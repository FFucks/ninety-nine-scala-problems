package P59

/*
P59 (**) Construct height-balanced binary trees.
In a height-balanced binary tree, the following property holds for every node: The height of its left subtree and the height of its right subtree are almost equal, which means their difference is not greater than one.
Write a method Tree.hbalTrees to construct height-balanced binary trees for a given height with a supplied value for the nodes.  The function should generate all solutions.
scala> Tree.hbalTrees(3, "x")
res0: List[Node[String]] = List(T(x T(x T(x . .) T(x . .)) T(x T(x . .) T(x . .))), T(x T(x T(x . .) T(x . .)) T(x T(x . .) .)), ...
 */

import Tree.*

class P59_impl_1 {

    def hbalTrees[T](height: Int, value: T): List[Tree[T]] = {

        if (height == 0) {
            return List(End)
        }
        if (height == 1) {
            return List(Node(value))
        }

        val treesH1 = hbalTrees(height - 1, value)
        val treesH2 = hbalTrees(height - 2, value)

        var result = List.empty[Tree[T]]

        for (left <- treesH1) {
            for (right <- treesH1) {
                result = result :+ Node(value, left, right)
            }
        }

        for (left <- treesH1) {
            for (right <- treesH2) {
                result = result :+ Node(value, left, right)
            }
        }

        for (left <- treesH2) {
            for (right <- treesH1) {
                result = result :+ Node(value, left, right)
            }
        }

        result
    }
}

@main
def P59Impl1(): Unit = {

    val dpk059 = new P59_impl_1

    val trees = dpk059.hbalTrees(3, "x")

    println(s"Tree Quantity: ${trees.length}")
    println()

    for (tree <- trees) {
        println(tree)
    }
}
