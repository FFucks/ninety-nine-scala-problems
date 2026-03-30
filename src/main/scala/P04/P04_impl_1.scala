package P04

/*P04(*) Find the number of elements of a list.
    Example:

        scala > length(List(1, 1, 2, 3, 5, 8))
        res0: Int = 6*/

class P04_impl_1 {

    def length[A](list: List[A]): Int = {
        var count = 0
        var current = list

        while (current != Nil) {
            count += 1
            current = current.tail
        }

        count
    }

}

@main def P04Impl1(): Unit = {

    val dpk04 = new P04_impl_1

    var result = dpk04.length(List(1, 1, 2, 3, 5, 8))
    println(result)

    result = dpk04.length(List(1, 1, 2, 3, 5, 8, 13, 21))
    println(result)

}
