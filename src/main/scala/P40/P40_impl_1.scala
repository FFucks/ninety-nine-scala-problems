package P40

import P31.P31_impl_1

/*
P40 (**) Goldbach’s conjecture.
Goldbach’s conjecture says that every positive even number greater than 2 is the sum of two prime numbers E.g.
28=5+23=5+23.It is one of the most famous facts in number theory that has not been proved to be correct in the general case.  It has been numerically confirmed up to very large numbers (much larger than Scala’s Int can represent).  Write a function to find the two prime numbers that sum up to a given even integer.

scala> 28.goldbach
res0: (Int, Int) = (5,23)
*/


class P40_impl_1 {

    private val p31 = new P31_impl_1

    def goldbach(number: Int): (Int, Int) = {
        if (number <= 2 || number % 2 != 0) {
            throw new IllegalArgumentException(
                "Number must be even and greater than 2"
            )
        }
        var firstPrime = 2
        while (firstPrime <= number / 2) {
            if (p31.isPrime(firstPrime)) {
                val secondPrime = number - firstPrime
                if (p31.isPrime(secondPrime)) {
                    return (firstPrime, secondPrime)
                }
            }
            firstPrime = firstPrime + 1
        }
        (-1, -1)
    }
}

@main
def P40Impl1(): Unit = {

    val dpk040 = new P40_impl_1

    println(s"10 -> ${dpk040.goldbach(10)}")
    println(s"28 -> ${dpk040.goldbach(28)}")
    println(s"36 -> ${dpk040.goldbach(36)}")
    println(s"100 -> ${dpk040.goldbach(100)}")
}