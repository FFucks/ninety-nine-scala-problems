package P07

/*P07(**) Flatten a nested list structure
.
Example:

    scala > flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8)*/

class P07_impl_1 {
    def flatten(list: List[Any]): List[Any] = {
        if (list.isEmpty) {
            List()
        } else {
            val head = list.head
            val tail = list.tail

            if (head.isInstanceOf[List[_]]) {
                flatten(head.asInstanceOf[List[Any]]) ::: flatten(tail)
            } else {
                head :: flatten(tail)
            }
        }
    }
}

@main def P07Impl1(): Unit = {

    val dpk07 = new P07_impl_1

    val result = dpk07.flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    println(result)

}