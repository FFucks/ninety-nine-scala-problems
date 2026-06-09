package P19

/*
P19 (**) Rotate a list N N places to the left.
Examples: scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
 */

class P19_impl_1 {

    def rotate[T](n: Int, list: List[T]): List[T] = {

        val size = list.length
        val shift = if (n >= 0) {
            n % size
        } else {
            size + (n % size)
        }

        list.drop(shift) ::: list.take(shift)
    }

}

@main def P19Impl1(): Unit = {

    val dpk019 = new P19_impl_1

    val result0 = dpk019.rotate(3, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))
    val result1 = dpk019.rotate(-2, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))


    println(result0)
    println(result1)
}