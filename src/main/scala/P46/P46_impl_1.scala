package P46

class P46_impl_1 {

    def and(a: Boolean, b: Boolean): Boolean = {
        a && b
    }

    def or(a: Boolean, b: Boolean): Boolean = {
        a || b
    }

    def nand(a: Boolean, b: Boolean): Boolean = {
        !(a && b)
    }

    def nor(a: Boolean, b: Boolean): Boolean = {
        !(a || b)
    }

    def xor(a: Boolean, b: Boolean): Boolean = {
        a != b
    }

    def impl(a: Boolean, b: Boolean): Boolean = {
        !a || b
    }

    def equ(a: Boolean, b: Boolean): Boolean = {
        a == b
    }

    def table2(expression: (Boolean, Boolean) => Boolean): Unit = {
        println("A\tB\tResult")
        val values = List(true, false)
        for (a <- values) {
            for (b <- values) {
                println(s"$a\t$b\t${expression(a, b)}")
            }
        }
    }
}

@main
def P46Impl1(): Unit = {

    val dpk046 = new P46_impl_1

    println(dpk046.and(true, true))
    println(dpk046.xor(true, true))
    println()

    dpk046.table2((a, b) => dpk046.and(a, dpk046.or(a, b)))
}
