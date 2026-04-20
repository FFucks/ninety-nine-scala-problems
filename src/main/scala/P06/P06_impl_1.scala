package P06

/*P06(*) Find out whether a list is a palindrome.
    Example:

        scala > isPalindrome(List(1, 2, 3, 2, 1))
        res0: Boolean = true*/

class P06_impl_1 {

    def isPalindrome[A](list: List[A]): Boolean = {

        def last(lst: List[A]): A = {
            if (lst.tail.isEmpty) {
                lst.head
            } else {
                last(lst.tail)
            }
        }

        def init(lst: List[A]): List[A] = {
            if (lst.tail.isEmpty) {
                Nil
            } else {
                lst.head :: init(lst.tail)
            }
        }

        if (list.isEmpty || list.tail.isEmpty) {
            true
        } else if (list.head != last(list)) {
            false
        } else {
            isPalindrome(init(list.tail))
        }
    }
}

@main def P06Impl1(): Unit = {

    val dpk06 = new P06_impl_1

    val result = dpk06.isPalindrome(List(1, 2, 3, 2, 1))
    println(result)

}