package P03

/*P03(*) Find the Kth element of a list
.
By convention
, the first element in the list is element 0.

Example:

    scala > nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2*/

class P03_impl_2 {

    def nth[A](value: Int, list: List[A]): A = {
        if (list.isEmpty) {
            throw new NoSuchElementException("Empty list")
        }

        if (value == 0) {
            list.head
        } else {
            nth(value - 1, list.tail)
        }
    }

}

@main def P03Impl2(): Unit = {

    val dpk03 = new P03_impl_2

    var result = dpk03.nth(2, List(1, 1, 2, 3, 5, 8))
    println(result)

    result = dpk03.nth(3, List(1, 1, 2, 3, 5, 8))
    println(result)

    result = dpk03.nth(8, List(1, 1, 2, 3, 5, 8))
    println(result)

}
