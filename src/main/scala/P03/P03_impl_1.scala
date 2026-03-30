package P03

/*P03(*) Find the Kth element of a list
.
By convention
, the first element in the list is element 0.

Example:

    scala > nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2*/

class P03_impl_1 {

    def nth[A](value: Int, list: List[A]): A = {

        if (value < 0) {
            throw new NoSuchElementException("Negative Index")
        }

        var index = value
        var current = list

        while (current != Nil) {
            if (index == 0) {
                return current.head
            }
            index -= 1
            current = current.tail
        }

        throw new NoSuchElementException("Index off the list")
    }

}

@main def P03Impl1(): Unit = {

    val dpk03 = new P03_impl_1

    var result = dpk03.nth(2, List(1, 1, 2, 3, 5, 8))
    println(result)

    result = dpk03.nth(3, List(1, 1, 2, 3, 5, 8))
    println(result)

    result = dpk03.nth(8, List(1, 1, 2, 3, 5, 8))
    println(result)

}
