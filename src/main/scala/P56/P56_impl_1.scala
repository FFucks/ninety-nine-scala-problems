package P56

import Tree.*

class P56_impl_1 {

    def isMirror[T](left: Tree[T], right: Tree[T]): Boolean = {
        (left, right) match {
            case (End, End) =>
                true
            case (Node(_, leftLeft, leftRight), Node(_, rightLeft, rightRight)) =>
                isMirror(leftLeft, rightRight) &&
                    isMirror(leftRight, rightLeft)
            case _ =>
                false
        }
    }

    def isSymmetric[T](tree: Tree[T]): Boolean = {
        tree match {
            case End =>
                true
            case Node(_, left, right) =>
                isMirror(left, right)
        }
    }
}

@main
def P56Impl1(): Unit = {

    val dpk056 = new P56_impl_1

    val tree1 =
        Node(
            "a",
            Node("b"),
            Node("c")
        )

    val tree2 =
        Node(
            "a",
            Node(
                "b",
                Node("d"),
                End
            ),
            Node("c")
        )

    println(dpk056.isSymmetric(tree1))
    println(dpk056.isSymmetric(tree2))
}
