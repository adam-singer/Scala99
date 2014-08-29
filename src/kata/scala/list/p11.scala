import Scala99._
import com.scalakata.eval._
@ScalaKata object P11 {
  val prob = problem(11, Easy, "Modified run-length encoding",
    """|Modify the result of problem P10 in such a way that if an element has no
       |duplicates it is simply copied into the result list. Only elements with
       |duplicates are transferred as (N, E) terms.""".stripMargin)
  example("""|encodeModified(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")) ==
             |  List((4,"a"), "b", (2,"c"), (2,"a"), "d", (4,"e"))""".stripMargin)
}
