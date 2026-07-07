package P31

class P31_impl_1 {

    def isPrime(number: Int): Boolean = {
        if (number < 2) {
            return false
        }

        var divisor = 2

        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                return false
            }
            divisor = divisor + 1
        }
        true
    }
}

@main def P31Impl1(): Unit = {

    val dpk031 = new P31_impl_1

    println(s"2 -> ${dpk031.isPrime(2)}")
    println(s"7 -> ${dpk031.isPrime(7)}")
    println(s"10 -> ${dpk031.isPrime(10)}")
    println(s"17 -> ${dpk031.isPrime(17)}")
    println(s"25 -> ${dpk031.isPrime(25)}")
    println(s"97 -> ${dpk031.isPrime(97)}")
}