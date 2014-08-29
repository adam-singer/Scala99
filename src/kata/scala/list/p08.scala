import Scala99._
import com.scalakata.eval._
@ScalaKata object P08 {
  val prob = problem(8, Medium, "Eliminate consecutive duplicates of list elements.",
    """|If a list contains repeated elements they should be replaced with a single copy of the element.
       |The order of the elements should not be changed.""".stripMargin)
  example("""|compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
             |  List('a, 'b, 'c, 'a, 'd, 'e)""".stripMargin)
}
