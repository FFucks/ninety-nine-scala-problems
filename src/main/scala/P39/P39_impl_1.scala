package P39

import P31.P31_impl_1

/*
P39 (*) A list of prime numbers.
Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.

scala> listPrimesinRange(7 to 31)
res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)
*/

class P39_impl_1 {

    private val p31 = new P31_impl_1

    def listPrimesInRange(lower: Int, upper: Int): List[Int] = {
        var result = List.empty[Int]
        var current = lower
        while (current <= upper) {
            if (p31.isPrime(current)) {
                result = result :+ current
            }
            current = current + 1
        }
        result
    }
}

@main
def P39Impl1(): Unit = {

    val dpk039 = new P39_impl_1

    println(dpk039.listPrimesInRange(7, 31))
    println(dpk039.listPrimesInRange(1, 50))
}
