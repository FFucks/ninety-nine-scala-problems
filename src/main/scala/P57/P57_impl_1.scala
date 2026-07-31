package P57

sealed abstract class Tree[+T]

case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T]

case object End extends Tree[Nothing]

object Node {
    def apply[T](value: T): Node[T] =
        new Node(value, End, End)
}

class P57_impl_1 {

    def addValue[T](tree: Tree[T], value: T)(using ord: Ordering[T]): Tree[T] = {

        tree match {
            case End =>
                Node(value)
            case Node(current, left, right) =>
                if (ord.lt(value, current)) {
                    Node(current, addValue(left, value), right)
                } else {
                    Node(current, left, addValue(right, value))
                }
        }
    }

    def fromList[T](values: List[T])(using ord: Ordering[T]): Tree[T] = {

        var tree: Tree[T] = End
        for (value <- values) {
            tree = addValue(tree, value)
        }
        tree
    }
}

@main
def P57Impl1(): Unit = {

    val dpk057 = new P57_impl_1
    var tree = dpk057.addValue(End, 2)
    println(tree)
    tree = dpk057.addValue(tree, 3)
    println(tree)
    tree = dpk057.addValue(tree, 0)
    println(tree)
    println()
    val tree2 = dpk057.fromList(List(3, 2, 5, 7, 1))

    println(tree2)
}