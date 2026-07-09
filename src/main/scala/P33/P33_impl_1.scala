package P33

class P33_impl_1 {
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

    def isCoprime(a: Int, b: Int): Boolean = {
        gcd(a, b) == 1
    }
}

@main
def P33Impl1(): Unit = {

    val dpk033 = new P33_impl_1

    println(s"35 e 64 -> ${dpk033.isCoprime(35, 64)}")
    println(s"36 e 63 -> ${dpk033.isCoprime(36, 63)}")
    println(s"15 e 28 -> ${dpk033.isCoprime(15, 28)}")
    println(s"10 e 25 -> ${dpk033.isCoprime(10, 25)}")
}