package P21

/*
P21 (*) Insert an element at a given position into a list.
Example:

scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
 */

import scala.collection.mutable.ListBuffer

class P21_impl_1 {

    def insertAt[A](elem: A, k: Int, list: List[A]): List[A] = {
        val result = ListBuffer[A]()
        var index = 0
        var inserted = false

        for (x <- list) {
            if (index == k) {
                result += elem
                inserted = true
            }

            result += x
            index += 1
        }

        if (!inserted) {
            result += elem
        }

        result.toList
    }

}

@main def P21Impl1(): Unit = {

    val dpk021 = new P21_impl_1

    val result0 = dpk021.insertAt("new", 1, List("a", "b", "c", "d"))

    println(result0)
}