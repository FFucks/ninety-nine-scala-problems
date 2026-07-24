package P49

/*
P49 (**) Gray code.
An
n
n-bit Gray code is a sequence of
n
n-bit strings constructed according to certain rules.

For example,
n = 1: C(1) = (“0”, “1”).
n = 2: C(2) = (“00”, “01”, “11”, “10”).
n = 3: C(3) = (“000”, “001”, “011”, “010”, “110”, “111”, “101”, “100”).

Find out the construction rules and write a function to generate Gray codes.

scala> gray(3)
res0 List[String] = List(000, 001, 011, 010, 110, 111, 101, 100)
See if you can use memoization to make the function more efficient.
 */

class P49_impl_1 {

    private val cache = scala.collection.mutable.Map[Int, List[String]]()

    def gray(bits: Int): List[String] = {

        if (cache.contains(bits)) {
            return cache(bits)
        }

        val result =
            if (bits <= 0) {
                List.empty[String]
            } else if (bits == 1) {
                List("0", "1")
            } else {
                val previous = gray(bits - 1)
                var list = List.empty[String]
                for (code <- previous) {
                    list = list :+ ("0" + code)
                }
                for (code <- previous.reverse) {
                    list = list :+ ("1" + code)
                }
                list
            }
        cache(bits) = result

        result
    }
}

@main
def P49Impl1(): Unit = {

    val dpk049 = new P49_impl_1

    println(dpk049.gray(1))
    println(dpk049.gray(2))
    println(dpk049.gray(3))
    println(dpk049.gray(4))
}