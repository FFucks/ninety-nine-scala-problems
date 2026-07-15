package P37

import P36.P36_impl_1

class P37_impl_1 {

    private val p36 = new P36_impl_1

    def power(base: Int, exponent: Int): Int = {

        var result = 1
        var count = 0
        while (count < exponent) {
            result = result * base
            count = count + 1
        }

        result
    }

    def totient(number: Int): Int = {

        val factors = p36.primeFactorMultiplicity(number)
        var result = 1
        var index = 0
        while (index < factors.length) {
            val prime = factors(index)._1
            val multiplicity = factors(index)._2
            result = result * ((prime - 1) * power(prime, multiplicity - 1))
            index = index + 1
        }

        result
    }
}

@main
def P37Impl1(): Unit = {

    val dpk037 = new P37_impl_1

    println(s"φ(10) = ${dpk037.totient(10)}")
    println(s"φ(36) = ${dpk037.totient(36)}")
    println(s"φ(315) = ${dpk037.totient(315)}")
    println(s"φ(120) = ${dpk037.totient(120)}")
}