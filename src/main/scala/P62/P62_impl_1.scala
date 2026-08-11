package P62

/*
P62 (*) Collect the internal nodes of a binary tree in a list.
An internal node of a binary tree has either one or two non-empty successors.  Write a method internalList to collect them in a list.

scala> Node('a', Node('b'), Node('c', Node('d'), Node('e'))).internalList
res0: List[Char] = List(a, c)

#P62B (*) Collect the nodes at a given level in a list.
A node of a binary tree is at level N N if the path from the root to the node has length N−1
N−1.  The root node is at level 1.  Write a method atLevel to collect all nodes at a given level in a list.

scala> Node('a', Node('b'), Node('c', Node('d'), Node('e'))).atLevel(2)
res0: List[Char] = List(b, c)
Using atLevel it is easy to construct a method levelOrder which creates the level-order sequence of the nodes.  However, there are more efficient ways to do that.
 */

import Tree.*

class P62_impl_1 {

    def internalList[T](tree: Tree[T]): List[T] = {

        if (tree == End) {
            return List.empty[T]
        }
        val node = tree.asInstanceOf[Node[T]]

        if (node.left == End && node.right == End) {
            return List.empty[T]
        }
        var result = List(node.value)

        result = result ++ internalList(node.left)
        result = result ++ internalList(node.right)

        result
    }
}


class P62B_impl_1 {

    def atLevel[T](tree: Tree[T], level: Int): List[T] = {

        if (tree == End) {
            return List.empty[T]
        }
        val node = tree.asInstanceOf[Node[T]]

        if (level == 1) {
            return List(node.value)
        }

        var result = List.empty[T]
        result = result ++ atLevel(node.left, level - 1)
        result = result ++ atLevel(node.right, level - 1)

        result
    }
}


@main
def P62Impl1(): Unit = {

    val dpk062 = new P62_impl_1

    val tree = Node('a', Node('b'), Node('c', Node('d'), Node('e')))
    val result = dpk062.internalList(tree)

    println(s"Internal Node: $result")
}


@main
def P62BImpl1(): Unit = {

    val dpk062B = new P62B_impl_1

    val tree = Node('a', Node('b'), Node('c', Node('d'), Node('e')))
    val result = dpk062B.atLevel(tree, 2)

    println(s"Level 2 node: $result")
}
