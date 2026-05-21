package P11

import scala.collection.mutable.ListBuffer

/*P11(*) Modified run - length encoding
.Modify the result of problem P10 in such a way that
if an element has no duplicates it is simply copied into the result list.
 Only elements
with duplicates are transferred as(N, E) terms
.Example: scala > encodeModified
(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) res0: List[Any]
= List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))*/

class P11_impl_1 {

    def encodeModified(list: List[String]): List[Any] = {
        val result = ListBuffer[Any]()

        if (list.isEmpty) {
            return result.toList
        }

        var current = list.head
        var count = 1

        for (i <- 1 until list.length) {

            val item = list(i)
            if (item == current) {
                count += 1
            } else {
                if (count == 1) {
                    result += current
                } else {
                    result += ((count, current))
                }

                current = item
                count = 1
            }
        }

        if (count == 1) {
            result += current
        } else {
            result += ((count, current))
        }
        result.toList
    }
}

@main def P11Impl1(): Unit = {

    val dpk011 = new P11_impl_1
    
    val input = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")

    val result = dpk011.encodeModified(input)

    println(result)
}

