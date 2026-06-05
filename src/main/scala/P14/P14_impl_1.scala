package P14

/*
P14 (*) Duplicate the elements of a list.
Example:

scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
 */

import scala.collection.mutable.ListBuffer

class P14_impl_1 {

    def duplicate[A](list: List[A]): List[A] = {

        val result = ListBuffer[A]()

        for (element <- list) {
            result += element
            result += element
        }

        result.toList
    }
}

@main def P14Impl1(): Unit = {

    val dpk014 = new P14_impl_1

    val input = List("a", "b", "c", "c", "d")

    val result = dpk014.duplicate(input)

    println(result)
}