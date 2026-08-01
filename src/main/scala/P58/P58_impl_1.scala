package P58

import Tree.*
import P55.*
import P56.*

/*
P58 (**) Generate-and-test paradigm.
Apply the generate-and-test paradigm to construct all symmetric, completely balanced binary trees with a given number of nodes.

scala> Tree.symmetricBalancedTrees(5, "x")
res0: List[Node[String]] = List(T(x T(x . T(x . .)) T(x T(x . .) .)), T(x T(x T(x . .) .) T(x . T(x . .))))
 */

class P58_impl_1 {

    private val p55 = new P55_impl_1
    private val p56 = new P56_impl_1

    def symmetricBalancedTrees[T](nodes: Int, value: T): List[Tree[T]] = {

        val balancedTrees = p55.cBalanced(nodes, value)
        var result = List.empty[Tree[T]]
        for (tree <- balancedTrees) {
            if (p56.isSymmetric(tree)) {
                result = result :+ tree
            }
        }

        result
    }
}

@main
def P58Impl1(): Unit = {

    val dpk058 = new P58_impl_1

    val trees = dpk058.symmetricBalancedTrees(5, "x")

    println(s"Quantidade de árvores: ${trees.length}")
    println()

    for (tree <- trees) {
        println(tree)
    }
}
