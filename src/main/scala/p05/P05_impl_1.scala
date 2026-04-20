package p05

/*P05(*) Reverse a list
.
Example:

    scala > reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)*/

class P05_impl_1 {

    def reverse[A](list: List[A]): List[A] = {

        def loop(remaining: List[A], acc: List[A]): List[A] = {
            if (remaining.isEmpty) {
                acc
            } else {
                loop(remaining.tail, remaining.head :: acc)
            }
        }

        loop(list, Nil)
    }

}

@main def P05Impl1(): Unit = {

    val dpk05 = new P05_impl_1

    val result = dpk05.reverse(List(1, 1, 2, 3, 5, 8))
    println(result)

}