package P25

/*
P25 (*) Generate a random permutation of the elements of a list.
Hint: Use the solution of problem P23.

Example:

scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
 */

import scala.util.Random

class P25_impl_1 {

    def randomPermute[A](list: List[A]): List[A] = {

        def loop(remaining: List[A]): List[A] = {
            if (remaining.isEmpty) {
                Nil
            } else {
                val randomIndex = Random.nextInt(remaining.length)

                val (before, after) = remaining.splitAt(randomIndex)

                val selected = after.head
                val rest = before ::: after.tail

                selected :: loop(rest)
            }
        }

        loop(list)
    }
}

@main def P25Impl1(): Unit = {

    val dpk025 = new P25_impl_1

    val result0 = dpk025.randomPermute(List("a", "b", "c", "d", "e", "f"))

    println(result0)
}
