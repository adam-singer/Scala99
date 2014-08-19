import com.scalakata.eval._
object Scala99 {
  sealed trait Difficulty
  case object Easy extends Difficulty { override def toString = "*" }
  case object Medium extends Difficulty { override def toString = "**" }
  case object Hard extends Difficulty { override def toString = "***" }

  def problem(number: Int, d: Difficulty, problem: String, description: String = ""): Html = {
    val snumber =
      if(number < 10) s"0$number"
      else number.toString

    Html(
      s"""|P$snumber ($d) $problem.
          |$description""".stripMargin
    )
  }
  def example(code: String) = Html(s"<pre>$code</pre>")
}
