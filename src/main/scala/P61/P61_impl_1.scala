package P61

/*
P61 (*) Count the leaves of a binary tree.
A leaf is a node with no successors.  Write a method leafCount to count them.
scala> Node('x', Node('x'), End).leafCount
res0: Int = 1

P61A (*) Collect the leaves of a binary tree in a list.
A leaf is a node with no successors.  Write a method leafList to collect them in a list.

scala> Node('a', Node('b'), Node('c', Node('d'), Node('e'))).leafList
res0: List[Char] = List(b, d, e)
 */

import Tree.*

class P61_impl_1 {

    def leafCount[T](tree: Tree[T]): Int = {

        if (tree == End) {
            return 0
        }
        val node = tree.asInstanceOf[Node[T]]

        if (node.left == End && node.right == End) {
            return 1
        }

        leafCount(node.left) + leafCount(node.right)
    }
}


class P61A_impl_1 {

    def leafList[T](tree: Tree[T]): List[T] = {

        if (tree == End) {
            return List.empty[T]
        }
        val node = tree.asInstanceOf[Node[T]]

        if (node.left == End && node.right == End) {
            return List(node.value)
        }

        leafList(node.left) ++ leafList(node.right)
    }
}


@main
def P61Impl1(): Unit = {

    val dpk061 = new P61_impl_1

    val tree = Node('a', Node('b'), Node('c', Node('d'), Node('e')))

    println(s"Leaf quantity: ${dpk061.leafCount(tree)}")
}


@main
def P61AImpl1(): Unit = {

    val dpk061A = new P61A_impl_1

    val tree = Node('a', Node('b'), Node('c', Node('d'), Node('e')))

    println(s"Leaf: ${dpk061A.leafList(tree)}")
}