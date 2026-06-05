package P15

import scala.collection.mutable.ListBuffer

/*P15(**) Duplicate the elements of a list a
given number
of times
.Example: scala > duplicateN
(3, List('a, 'b, 'c, 'c, 'd)) res0: List[Symbol]
= List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd,
'*/

class P15_impl_1 {

    def duplicateN[T](n: Int, list: List[T]): List[T] = {
        val result = ListBuffer[T]()

        for (elem <- list) {
            for (_ <- 1 to n) {
                result += elem
            }
        }

        result.toList
    }
}

@main def P15Impl1(): Unit = {

    val dpk015 = new P15_impl_1

    val input = List("a", "b", "c", "c", "d")

    val result = dpk015.duplicateN(3, List("a", "b", "c", "c", "d"))

    println(result)
}