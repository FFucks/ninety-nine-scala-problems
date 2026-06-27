package P26

/*
P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
In how many ways can a committee of 3 be chosen from a group of 12 people?  We all know that there are C(12,3)=220
C(12,3)=220 possibilities (C(N,K)
C(N,K) denotes the well-known binomial coefficient).  For pure mathematicians, this result may be great.  But we want to really generate all the possibilities.

Example:

scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e)
 */

class P26_impl_1 {

    def combinations[A](k: Int, list: List[A]): List[List[A]] = {
        if (k == 0) {
            List(Nil)
        } else {
            list match {
                case Nil =>
                    Nil

                case head :: tail =>
                    val withHead =
                        combinations(k - 1, tail).map(comb => head :: comb)

                    val withoutHead =
                        combinations(k, tail)

                    withHead ::: withoutHead
            }
        }
    }
}

@main def P26Impl1(): Unit = {

    val dpk026 = new P26_impl_1

    val result0 = dpk026.combinations(3, List("a", "b", "c", "d", "e", "f"))

    println(result0)
}