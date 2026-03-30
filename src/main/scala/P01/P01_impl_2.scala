package P01

/*P01(*) Find the last element of a list
.
Example:

    scala > last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8*/

class P01_impl_2 {

    def last[A](list: List[A]): A = list match {
        case Nil => throw new NoSuchElementException("Empty List")
        case x :: Nil => x
        case _ :: tail => last(tail)
    }

}

@main def P01Impl2(): Unit = {

    val dpk01 = new P01_impl_2

    val result = dpk01.last(List(1, 1, 2, 3, 5, 8))
    println(result)
}