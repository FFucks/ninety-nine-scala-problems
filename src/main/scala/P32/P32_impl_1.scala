package P32

/*
P32 (**) Determine the greatest common divisor of two positive integer numbers.
Use Euclid’s algorithm.

scala> gcd(36, 63)
res0: Int = 9
 */

class P32_impl_1 {
    def gcd(a: Int, b: Int): Int = {

        var first = a
        var second = b
        while (second != 0) {
            val remainder = first % second
            first = second
            second = remainder
        }
        first
    }
}

@main
def P32Impl1(): Unit = {

    val dpk032 = new P32_impl_1

    println(dpk032.gcd(36, 63))
    println(dpk032.gcd(15, 25))
    println(dpk032.gcd(48, 18))
    println(dpk032.gcd(100, 40))
}