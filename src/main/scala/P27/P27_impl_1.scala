package P27

/*
P27 (**) Group the elements of a set into disjoint subsets.
a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?  Write a function that generates all the possibilities.

Example:

scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ... 
b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.

Example:

scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ... 
Note that we do not want permutations of the group members; i.e. ((Aldo, Beat), …) is the same solution as ((Beat, Aldo), …).  However, we make a difference between ((Aldo, Beat), (Carla, David), …) and ((Carla, David), (Aldo, Beat), …).

You may find more about this combinatorial problem in a good book on discrete mathematics under the term “multinomial coefficients”.
 */

class P27_impl_1 {

    def combinations[A](n: Int, list: List[A]): List[List[A]] = {
        if (n == 0) {
            List(Nil)
        } else {
            list match {
                case Nil => Nil

                case head :: tail =>
                    combinations(n - 1, tail).map(head :: _) :::
                        combinations(n, tail)
            }
        }
    }

    def removeAll[A](list: List[A], elems: List[A]): List[A] = {
        list.filterNot(elems.contains)
    }

    def group[A](sizes: List[Int], list: List[A]): List[List[List[A]]] = {
        sizes match {

            case Nil =>
                List(Nil)

            case size :: rest =>
                for {
                    combination <- combinations(size, list)
                    remaining = removeAll(list, combination)
                    groups <- group(rest, remaining)
                } yield {
                    combination :: groups
                }
        }
    }

    def group3[A](list: List[A]): List[List[List[A]]] = {
        group(List(2, 3, 4), list)
    }

}

@main def P27Impl1(): Unit = {

    val dpk027 = new P27_impl_1


    val result0 = dpk027.group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    val result1 = dpk027.group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))

    println(result0)
    println(result1)
}