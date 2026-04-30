These are an adaptation of the Ninety-Nine Prolog Problems written by Werner Hett at the Berne University of Applied Sciences in Berne, Switzerland.  I (Pip! Gold) have altered them to be more amenable to programming in Scala.  Feedback is appreciated, particularly on anything marked TODO.

The problems have different levels of difficulty.  Those marked with a single asterisk (*) are easy.  If you have successfully solved the preceeding problems you should be able to solve them within a few (say 15) minutes.  Problems marked with two asterisks (**) are of intermediate difficulty.  If you are a skilled Scala programmer it shouldn’t take you more than 30-90 minutes to solve them.  Problems marked with three asterisks (***) are more difficult.  You may need more time (i.e. a few hours or more) to find a good solution.  The difficulties were all assigned for the Prolog problems, but the Scala versions seem to be of roughly similar difficulty.

Your goal should be to find the most elegant solution of the given problems.  Efficiency is important, but clarity is even more crucial.  Some of the (easy) problems can be trivially solved using built-in functions.  However, in these cases, you learn more if you try to find your own solution.

Solutions are available by clicking on the link at the beginning of the problem description.

[I don’t have example solutions to all of the problems yet.  I’m working on getting them all done, but in the meantime, contributed solutions, particularly from seasoned Scala programmers would be appreciated.  If you feel a particular problem can be solved in a better manner than I did, please let me know that, too.  <PMG>]

§Working with lists
In Scala, lists are objects of type List[A], where A can be any type.  Lists are effective for many recursive algorithms, because it’s easy to add elements to the head of a list, and to get the tail of the list, which is everything but the first element.

The solutions to the problems in this section will be in objects named after the problems (P01, P02, etc.).  You can compile the source files with scalac and thereafter use import to bring the functions into scope.  Some of the problems can be solved easily by using imported solutions to previous problems.

In many cases, there’s more than one reasonable approach.  The files linked here may include multiple solutions, with all but one commented out.  They’ll also indicate whether there’s a builtin method in Scala that accomplishes the task.

#P01 (*) Find the last element of a list.
Example:

scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8

#P02 (*) Find the last but one element of a list.
Example:

scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5

#P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.

Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2

#P04 (*) Find the number of elements of a list.
Example:

scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6

#P05 (*) Reverse a list.
Example:

scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)

#P06 (*) Find out whether a list is a palindrome.
Example:

scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true

#P07 (**) Flatten a nested list structure.
Example:

scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)

#P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element.  The order of the elements should not be changed.

Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

#P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.

Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))