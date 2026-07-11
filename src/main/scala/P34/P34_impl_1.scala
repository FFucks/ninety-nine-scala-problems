package P34

/*
P34 (**) Calculate Euler’s totient function
ϕ(m)ϕ(m).Euler’s so-called totient function
ϕ(m)
ϕ(m) is defined as the number of positive integers
r(1<=r<=m)
r(1<=r<=m) that are coprime tomm.
 */

import P33.P33_impl_1

class P34_impl_1 {

    private val p33 = new P33_impl_1

    def totient(number: Int): Int = {
        var count = 0
        var current = 1
        while (current <= number) {
            if (p33.isCoprime(current, number)) {
                count = count + 1
            }
            current = current + 1
        }
        count
    }
}
@main
def P34Impl1(): Unit = {

    val dpk034 = new P34_impl_1

    println(s"φ(1) = ${dpk034.totient(1)}")
    println(s"φ(2) = ${dpk034.totient(2)}")
    println(s"φ(5) = ${dpk034.totient(5)}")
    println(s"φ(10) = ${dpk034.totient(10)}")
    println(s"φ(15) = ${dpk034.totient(15)}")
}
