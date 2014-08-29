import Scala99._
import com.scalakata.eval._
@ScalaKata object P10 {
  val prob = problem(10, Easy, "Run-length encoding of a list",
    """|Use the result of problem P09 to implement the so-called
       |run-length encoding data compression method. Consecutive duplicates of elements are
       |encoded as tuples (N, E) where N is the number of duplicates of the element E.""".stripMargin)
  example("""|encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
             |  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))""".stripMargin)
}
