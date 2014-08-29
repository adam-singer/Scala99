import Scala99._
import com.scalakata.eval._
@ScalaKata object P03_sol {
  P03.prob
  def nth[T](i: Int)(xs: List[T]): T = xs(i)
  nth(2)(List(1, 1, 2, 3, 5, 8)) == 2
}
