package P23

/*
P23 (**) Extract a given number of randomly selected elements from a list.
Example:

scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res0: List[Symbol] = List('e, 'd, 'a)
Hint: Use the solution to problem P20
 */

import scala.util.Random

class P23_impl_1 {

    def removeAt[A](index: Int, list: List[A]): (List[A], A) =
        val (before, after) = list.splitAt(index)
        (before ::: after.tail, after.head)

    def randomSelect[A](n: Int, list: List[A]): List[A] =
        if n <= 0 || list.isEmpty then
            Nil
        else
            val randomIndex = Random.nextInt(list.length)
            val (remaining, selected) = removeAt(randomIndex, list)
            selected :: randomSelect(n - 1, remaining)
}

@main def P23Impl1(): Unit = {

    val dpk023 = new P23_impl_1

    val result0 = dpk023.randomSelect(3, List("a", "b", "c", "d", "f", "g", "h"))

    println(result0)
}
