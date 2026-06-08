package P18

/*
P18 (**) Extract a slice from a list.
Given two indices,
I
I and
K
K, the slice is the list containing the elements from and including the
I
Ith element up to but not including the
K
Kth element of the original list.  Start counting the elements with 0.

Example:

scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
 */

import scala.collection.mutable.ListBuffer

class P18_impl_1 {

    def slice[T](i: Int, k: Int, list: List[T]): List[T] = {
        val result = ListBuffer[T]()

        var index = 0

        for (elem <- list) {
            if (index >= i && index < k) {
                result += elem
            }

            index += 1
        }

        result.toList
    }

}

@main def P18Impl1(): Unit = {

    val dpk018 = new P18_impl_1

    val result = dpk018.slice(3, 7, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"))


    println(result)
}