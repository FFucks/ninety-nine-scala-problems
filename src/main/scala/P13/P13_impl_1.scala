package P13

/*
P13 (**) Run-length encoding of a list (direct solution).
Implement the so-called run-length encoding data compression method directly.  I.e. don’t use other methods you’ve written (like P09’s pack); do all the work directly.

Example:

scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
 */

import scala.collection.mutable.ListBuffer

class P13_impl_1 {

    def encodeDirect[A](list: List[A]): List[(Int, A)] = {

        if (list.isEmpty) {
            return Nil
        }

        val result = ListBuffer[(Int, A)]()

        var current = list.head
        var count = 1

        for (element <- list.tail) {

            if (element == current) {
                count += 1
            } else {
                result += ((count, current))
                current = element
                count = 1
            }
        }

        result += ((count, current))

        result.toList
    }
}

@main def P13Impl1(): Unit = {

    val dpk013 = new P13_impl_1

    val input = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")

    val result = dpk013.encodeDirect(input)

    println(result)
}