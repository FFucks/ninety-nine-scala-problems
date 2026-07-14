package P36

import P35.P35_impl_1

/*
P36 (**) Determine the prime factors of a given positive integer (2).
Construct a list containing the prime factors and their multiplicity.

scala> 315.primeFactorMultiplicity
res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))
*/

class P36_impl_1 {

    private val p35 = new P35_impl_1

    def primeFactorMultiplicity(number: Int): List[(Int, Int)] = {

        val primeFactors = p35.primeFactors(number)
        if (primeFactors.isEmpty) {
            return List.empty[(Int, Int)]
        }

        var result = List.empty[(Int, Int)]
        var currentFactor = primeFactors.head
        var count = 1
        var index = 1
        while (index < primeFactors.length) {
            if (primeFactors(index) == currentFactor) {
                count = count + 1
            } else {
                result = result :+ (currentFactor, count)
                currentFactor = primeFactors(index)
                count = 1
            }
            index = index + 1
        }

        result :+ (currentFactor, count)
    }
}

@main
def P36Impl1(): Unit = {

    val dpk036 = new P36_impl_1

    println(dpk036.primeFactorMultiplicity(315))
    println(dpk036.primeFactorMultiplicity(84))
    println(dpk036.primeFactorMultiplicity(120))
    println(dpk036.primeFactorMultiplicity(97))
}