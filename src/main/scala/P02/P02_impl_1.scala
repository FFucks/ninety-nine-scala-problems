package P02

/*P02(*) Find the last but one element of a list
.
Example:

    scala > penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5*/

class P02_impl_1 {

    def penultimate[A](list: List[A]): A = {
        if (list.isEmpty || list.tail.isEmpty) {
            throw new NoSuchElementException("List is empty or too short")
        }

        var current = list

        while (current.tail.tail != Nil) {
            current = current.tail
        }

        current.head
    }

}

@main def P02Impl1(): Unit = {

    val dpk02 = new P02_impl_1

    val result = dpk02.penultimate(List(1, 1, 2, 3, 5, 8))
    println(result)
}
