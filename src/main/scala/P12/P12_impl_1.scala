package P12

import scala.collection.mutable.ListBuffer

class P12_impl_1 {

    def decode[A](list: List[(Int, A)]): List[A] = {
        val result = ListBuffer[A]()

        for ((count, value) <- list) {
            for (_ <- 1 to count) {
                result += value
            }
        }

        result.toList
    }
}

@main def P12Impl1(): Unit = {

    val dpk012 = new P12_impl_1

    val input = List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))

    val result = dpk012.decode(input)

    println(result)
}
