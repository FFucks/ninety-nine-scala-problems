package P08

/*P08(**) Eliminate consecutive duplicates of list elements.
    If a list contains repeated elements they should be replaced
with a single copy of the element
. The order of the elements should not be changed.

    Example:

        scala > compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
        res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)*/

class P08_impl_1 {
    def compress(list: List[Any]): List[Any] = {
        if (list.isEmpty) return List()

        var result = List(list.head)
        var current = list.tail
        var last = list.head

        while (current.nonEmpty) {
            val head = current.head

            if (head != last) {
                result = result :+ head
                last = head
            }

            current = current.tail
        }

        result
    }
}

@main def P08Impl1(): Unit = {

    val dpk08 = new P08_impl_1

    val result = dpk08.compress(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
    println(result)

}