package P41

import P40.P40_impl_1

/*
P41 (**) A list of Goldbach compositions.
Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.

scala> printGoldbachList(9 to 20)
10 = 3 + 7
12 = 5 + 7
14 = 3 + 11
16 = 3 + 13
18 = 5 + 13
20 = 3 + 17
In most cases, if an even number is written as the sum of two prime numbers, one of them is very small.  Very rarely, the primes are both bigger than, say, 50.  Try to find out how many such cases there are in the range 2..3000.

Example (minimum value of 50 for the primes):

scala> printGoldbachListLimited(1 to 2000, 50)
992 = 73 + 919
1382 = 61 + 1321
1856 = 67 + 1789
1928 = 61 + 1867
 */

class P41_impl_1 {

    private val p40 = new P40_impl_1

    def printGoldbachList(lower: Int, upper: Int): Unit = {

        var current = lower
        while (current <= upper) {
            if (current > 2 && current % 2 == 0) {
                val result = p40.goldbach(current)
                println(s"$current = ${result._1} + ${result._2}")
            }

            current = current + 1
        }
    }

    def printGoldbachListLimited(lower: Int, upper: Int, limit: Int): Unit = {

        var current = lower
        while (current <= upper) {
            if (current > 2 && current % 2 == 0) {
                val result = p40.goldbach(current)
                if (result._1 >= limit && result._2 >= limit) {
                    println(s"$current = ${result._1} + ${result._2}")
                }
            }
            current = current + 1
        }
    }
}
@main
def P41Impl1(): Unit = {

    val dpk041 = new P41_impl_1

    println("Goldbach List")
    dpk041.printGoldbachList(9, 20)

    println()

    println("Goldbach List Limited")
    dpk041.printGoldbachListLimited(1, 2000, 50)
}
