package P16

/*P16(**) Drop every
N
Nth element from a list.
    Example:

        scala > drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)*/

import scala.collection.mutable.ListBuffer

class P16_impl_1 {

    def drop[T](n: Int, list: List[T]): List[T] = {
        val result = ListBuffer[T]()
        var counter = 1

        for (elem <- list) {
            if (counter != n)
                result += elem

            counter += 1

            if (counter > n)
                counter = 1
        }

        result.toList
    }
}

@main def P16Impl1(): Unit = {

    val dpk016 = new P16_impl_1

    val result = dpk016.drop(3, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))

    println(result)
}