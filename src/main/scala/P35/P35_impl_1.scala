package P35

/*
P35 (**) Determine the prime factors of a given positive integer. 
Construct a flat list containing the prime factors in ascending order.

scala> 315.primeFactors
res0: List[Int] = List(3, 3, 5, 7)
 */

class P35_impl_1 {

    def primeFactors(number: Int): List[Int] = {

        var currentNumber = number
        var divisor = 2
        var factors = List.empty[Int]
        while (currentNumber > 1) {
            if (currentNumber % divisor == 0) {
                factors = factors :+ divisor
                currentNumber = currentNumber / divisor
            } else {
                divisor = divisor + 1
            }
        }
        factors
    }
}

@main
def P35Impl1(): Unit = {

    val dpk035 = new P35_impl_1

    println(dpk035.primeFactors(315))
    println(dpk035.primeFactors(84))
    println(dpk035.primeFactors(97))
    println(dpk035.primeFactors(120))
}