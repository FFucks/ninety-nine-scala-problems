package P28

/*
P28 (**) Sorting a list of lists according to length of sublists.
a) We suppose that a list contains elements that are lists themselves.  The objective is to sort the elements of the list according to their length.  E.g. short lists first, longer lists later, or vice versa.

Example:

scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
 */

class P28_impl_1 {

    def lsort[A](lists: List[List[A]]): List[List[A]] = {
        def insert(list: List[A], sorted: List[List[A]]): List[List[A]] = {
            sorted match {
                case Nil =>
                    List(list)

                case first :: remaining =>
                    if (list.length <= first.length) {
                        list :: sorted
                    } else {
                        first :: insert(list, remaining)
                    }
            }
        }

        lists.foldLeft(List.empty[List[A]]) { (sorted, current) =>
            insert(current, sorted)
        }
    }
}

@main def P27Impl1(): Unit = {

    val dpk028 = new P28_impl_1

    val result0 = dpk028.lsort(List(List("a", "b", "c"), List("d", "e"), List("f", "g", "h"), List("d", "e"), List("i", "j", "k", "l"), List("m", "n"), List("o")))

    println(result0)
}