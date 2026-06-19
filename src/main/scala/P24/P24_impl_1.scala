package P24

/*
P24 (*) Lotto: Draw
N
N different random numbers from the set
1..
M
1..M.
Example:

scala> lotto(6, 49)
res0: List[Int] = List(23, 1, 17, 33, 21, 37)
 */

import scala.util.Random

class P24_impl_1 {

    def lotto(n: Int, m: Int): List[Int] = {

        def loop(count: Int, numbers: List[Int]): List[Int] = {
            if (count == 0 || numbers.isEmpty) {
                Nil
            } else {
                val randomIndex = Random.nextInt(numbers.length)

                val (before, after) = numbers.splitAt(randomIndex)

                val selected = after.head
                val remaining = before ::: after.tail

                selected :: loop(count - 1, remaining)
            }
        }

        val numbers = (1 to m).toList

        loop(n, numbers)
    }
}

@main def P24Impl1(): Unit = {

    val dpk024 = new P24_impl_1

    val result0 = dpk024.lotto(6, 49)

    println(result0)
}
