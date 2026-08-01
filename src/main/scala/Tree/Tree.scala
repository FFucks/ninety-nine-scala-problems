package Tree

sealed abstract class Tree[+T]

case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {

    override def toString: String = "T(" + value + " " + left + " " + right + ")"
}

case object End extends Tree[Nothing] {
    override def toString: String = "."
}

object Node {

    def apply[T](value: T): Node[T] = {
        new Node(value, End, End)
    }
}
