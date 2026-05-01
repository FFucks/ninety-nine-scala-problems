package P09

/*P09(**) Pack consecutive duplicates of list elements into sublists.
    If a list contains repeated elements they should be placed in separate sublists.

    Example:

        scala > pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
        res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))*/

class P09_impl_1 {

    def pack[A](list: List[A]): List[List[A]] = {
        if (list.isEmpty) {
            List()
        } else {
            val head = list.head

            val (same, rest) = list.span(_ == head)

            same :: pack(rest)
        }
    }
    
}

@main def P08Impl1(): Unit = {

    val dpk09 = new P09_impl_1

    val result = dpk09.pack(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
    println(result)

}