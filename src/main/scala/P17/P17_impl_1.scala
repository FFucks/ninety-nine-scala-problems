package P17

/*
P17 (*) Split a list into two parts.
The length of the first part is given.  Use a Tuple for your result.

Example:

scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i,
 */

import scala.collection.mutable.ListBuffer

class P17_impl_1 {

    def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
        val left = ListBuffer[T]()
        val right = ListBuffer[T]()

        var count = 0

        for (elem <- list) {
            if (count < n) {
                left += elem
            } else {
                right += elem
            }

            count += 1
        }

        (left.toList, right.toList)
    }
}


@main def P17Impl1(): Unit = {

    val dpk017 = new P17_impl_1

    val result = dpk017.split(3, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))


    println(result)
}