import Scala99._
import com.scalakata.eval._
@ScalaKata object P12 {
  val prob = problem(12, Medium, "Decode a run-length encoded list",
    """|Given a run-length code list generated as specified in problem
       |<a href="P10">P10</a>, construct its uncompressed version.""".stripMargin)
  example("""|decode(List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))) ==
             |List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")""".stripMargin)
}
