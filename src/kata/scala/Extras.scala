import com.scalakata.eval._
object Scala99 {
  private def pnum(number: Int) =
    "p" + {
      if(number < 10) s"0$number"
      else number.toString
    }

  def problem(number: Int, d: Difficulty, prob: String, description: String = ""): Html = {
    val n = pnum(number + 1)
    html"""|${pnum(number)} ($d) ${prob}.
           |$description
           |<style>
           |  .insight{ padding-right: 60px; }
           |  .next {
           |    color: inherit;
           |    position: absolute;
           |    top: 0;
           |    right: -50px;
           |    margin: 10px 55px 0 10px
           |  }
           |</style>
           |<a class='next' href='$n'>$n <i class='fa fa-chevron-right'></a>""".stripMargin
  }
  def example(e: String) = html"<pre>$e</pre>"

  sealed trait Difficulty
  case object Easy extends Difficulty { override def toString = "*" }
  case object Medium extends Difficulty { override def toString = "**" }
  case object Hard extends Difficulty { override def toString = "***" }
}
