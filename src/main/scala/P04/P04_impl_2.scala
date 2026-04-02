package P04

class P04_impl_2 {

    def length[A](list: List[A]): Int = {
        if (list.isEmpty) {
            0
        } else {
            1 + length(list.tail)
        }
    }

}

@main def P04Impl2(): Unit = {

    val dpk04 = new P04_impl_2

    var result = dpk04.length(List(1, 1, 2, 3, 5, 8))
    println(result)

    result = dpk04.length(List(1, 1, 2, 3, 5, 8, 13, 21))
    println(result)

    result = dpk04.length(List(1, 1, 2, 3, 5, 8, 13, 21, 43))
    println(result)

}