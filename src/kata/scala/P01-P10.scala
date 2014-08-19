import Scala99._
import com.scalakata.eval._
@ScalaKata object P01_P10 {
  problem(1, Easy, "Find the last element of a list")
  example("last(List(1, 1, 2, 3, 5, 8)) == 8")

  problem(2, Easy, "Find the last but one element of a list")
  example("penultimate(List(1, 1, 2, 3, 5, 8)) == 5")

  problem(3, Easy, "Find the Kth element of a list", "By convention, the first element in the list is element 0")
  example("nth(2, List(1, 1, 2, 3, 5, 8)) == 2")

  problem(4, Easy, "Find the number of elements of a list")
  example("length(List(1, 1, 2, 3, 5, 8)) == 6")

  problem(5, Easy, "Reverse a list")
  example("reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1)")

  problem(6, Easy, "Find out whether a list is a palindrome")
  example("isPalindrome(List(1, 2, 3, 2, 1)) = true")

  problem(7, Medium, "Flatten a nested list structure")
  example("flatten(List(List(1, 1), 2, List(3, List(5, 8)))) = List(1, 1, 2, 3, 5, 8)")

  problem(8, Medium, "Eliminate consecutive duplicates of list elements.",
    """|If a list contains repeated elements they should be replaced with a single copy of the element.
       |The order of the elements should not be changed.""".stripMargin)
  example("""|compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
             |  List('a, 'b, 'c, 'a, 'd, 'e)""".stripMargin)

  problem(9, Medium, "Pack consecutive duplicates of list elements into sublists",
    "If a list contains repeated elements they should be placed in separate sublists")
  example("""|pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
             |  List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))""".stripMargin)

  problem(10, Easy, "Run-length encoding of a list",
    """|Use the result of problem P09 to implement the so-called
       |run-length encoding data compression method. Consecutive duplicates of elements are
       |encoded as tuples (N, E) where N is the number of duplicates of the element E.""".stripMargin)
  example("""|encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
             |  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))""".stripMargin)
}
