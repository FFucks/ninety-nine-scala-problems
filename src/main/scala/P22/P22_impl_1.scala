package P22

/*
P22 (*) Create a list containing all integers within a given range.
Example:

scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
 */

class P22_impl_1 {

    def range(start: Int, end: Int): List[Int] =
        if (start > end) {
            Nil
        } else {
            start :: range(start + 1, end)
        }
}

@main def P22Impl1(): Unit = {

    val dpk022 = new P22_impl_1

    val result0 = dpk022.range(4, 9)

    println(result0)
}