package P61

/*
P61 (*) Count the leaves of a binary tree.
A leaf is a node with no successors.  Write a method leafCount to count them.
scala> Node('x', Node('x'), End).leafCount
res0: Int = 1
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

@main
def P61Impl1(): Unit = {

    val dpk061 = new P61_impl_1

    val tree = Node('x', Node('x'), End)

    val result = dpk061.leafCount(tree)

    println(s"Leaf Quantity: $result")
}
