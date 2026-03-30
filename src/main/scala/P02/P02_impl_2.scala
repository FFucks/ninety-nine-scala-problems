package P02

/*P02(*) Find the last but one element of a list
.
Example:

    scala > penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5*/

class P02_impl_2 {

    def penultimate[A](list: List[A]): A = {
        if (list.isEmpty || list.tail.isEmpty) {
            throw new NoSuchElementException("List is empty or too short")
        }

        if (list.tail.tail.isEmpty) {
            list.head
        } else {
            penultimate(list.tail)
        }
    }

}

@main def P02Impl2(): Unit = {

    val dpk02 = new P02_impl_2

    val result = dpk02.penultimate(List(1, 1, 2, 3, 5, 8))
    println(result)
}

