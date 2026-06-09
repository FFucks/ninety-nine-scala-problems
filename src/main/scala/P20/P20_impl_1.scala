package P20

/*
P20 (*) Remove the
K
Kth element from a list.
Return the list and the removed element in a Tuple.  Elements are numbered from 0.

Example:

scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
 */

import scala.collection.mutable.ListBuffer

class P20_impl_1 {

    def removeAt[A](k: Int, list: List[A]): (List[A], A) = {
        val result = ListBuffer[A]()
        var removed: Option[A] = None
        var index = 0

        for (elem <- list) {
            if (index == k) {
                removed = Some(elem)
            } else {
                result += elem
            }

            index += 1
        }

        (result.toList, removed.get)
    }
}

@main def P20Impl1(): Unit = {

    val dpk020 = new P20_impl_1

    val result0 = dpk020.removeAt(1, List("a", "b", "c", "d"))

    println(result0)
}