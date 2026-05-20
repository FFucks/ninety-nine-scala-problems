package P10

/*P10(*) Run -length encoding of a list.
    Use the result of problem P09 to implement the so -called run -length encoding data compression method.
 Consecutive duplicates of elements are encoded as tuples(N, E) where
    N
N is the number of duplicates of the element E E.

Example:

    scala > encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))*/

class P10_impl_1 {
    def encode[A](list: List[A]): List[(Int, A)] = {

        def loop(remaining: List[A], current: A, count: Int, acc: List[(Int, A)]): List[(Int, A)] = {

            remaining match {

                case Nil =>
                    acc :+ (count, current)

                case head :: tail if head == current =>
                    loop(tail, current, count + 1, acc)

                case head :: tail =>
                    loop(tail, head, 1, acc :+ (count, current))
            }
        }

        list match {
            case Nil =>
                Nil

            case head :: tail =>
                loop(tail, head, 1, List())
        }
    }
}

@main def P10Impl1(): Unit = {

    val dpk010 = new P10_impl_1

    val result = dpk010.encode(
        List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))

    println(result)
}