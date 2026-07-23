package P47

/*
P47 (*) Truth tables for logical expressions (2).
Continue problem P46 by redefining and, or, etc as operators.  (i.e. make them methods of a new class with an implicit conversion from Boolean.)  not will have to be left as a object method.

scala> table2((a: Boolean, b: Boolean) => a and (a or not(b)))
A     B     result
true  true  true
true  false true
false true  false
false false false
 */

class P47_impl_1 {

    extension (a: Boolean) {
        def and(b: Boolean): Boolean = {
            a && b
        }
        def or(b: Boolean): Boolean = {
            a || b
        }
        def nand(b: Boolean): Boolean = {
            !(a && b)
        }
        def nor(b: Boolean): Boolean = {
            !(a || b)
        }
        def xor(b: Boolean): Boolean = {
            a != b
        }
        def impl(b: Boolean): Boolean = {
            !a || b
        }
        def equ(b: Boolean): Boolean = {
            a == b
        }
    }

    def not(value: Boolean): Boolean = {
        !value
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
def P47Impl1(): Unit = {
    val dpk047 = new P47_impl_1

    import dpk047.*

    dpk047.table2((a, b) => a.and(a.or(dpk047.not(b))))
}
