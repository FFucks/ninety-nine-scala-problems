package P38

import P34.P34_impl_1
import P37.P37_impl_1

/* P38 (*) Compare the two methods of calculating Euler’s totient function.
Use the solutions of problems P34 and P37 to compare the algorithm. Try to calculate
ϕ(10090)
ϕ(10090) as an example.
*/

class P38_impl_1 {

    private val p34 = new P34_impl_1
    private val p37 = new P37_impl_1

    def compare(number: Int): Unit = {

        var startTime = System.nanoTime()
        val resultP34 = p34.totient(number)
        var endTime = System.nanoTime()

        val p34Time = endTime - startTime

        startTime = System.nanoTime()
        val resultP37 = p37.totient(number)
        endTime = System.nanoTime()

        val p37Time = endTime - startTime

        println(s"P34 Result : $resultP34")
        println(s"P34 Time   : $p34Time ns")

        println()

        println(s"P37 Result : $resultP37")
        println(s"P37 Time   : $p37Time ns")
    }
}

@main
def P38Impl1(): Unit = {

    val dpk038 = new P38_impl_1

    dpk038.compare(10090)
}