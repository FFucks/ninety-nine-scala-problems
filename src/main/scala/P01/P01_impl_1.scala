package P01

/*P01(*) Find the last element of a list
.
Example:

    scala > last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8*/

class P01_impl_1 {

    def last[A](list: List[A]): A = {
        if (list.isEmpty) {
            throw new NoSuchElementException("Empty List")
        }

        var current = list
        while (current.tail != Nil) {
            current = current.tail
        }
        current.head
    }

}

@main def P01Impl1(): Unit = {

    val dpk01 = new P01_impl_1

    val result = dpk01.last(List(1, 1, 2, 3, 5, 8))
    println(result)
}
