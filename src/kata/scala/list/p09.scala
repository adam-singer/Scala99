import Scala99._
import com.scalakata.eval._
@ScalaKata object P09 {
  val prob = problem(9, Medium, "Pack consecutive duplicates of list elements into sublists",
    "If a list contains repeated elements they should be placed in separate sublists")
  example("""|pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
             |  List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))""".stripMargin)
}
