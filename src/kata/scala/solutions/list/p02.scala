import Scala99._
import com.scalakata.eval._
@ScalaKata object P02_sol {
  P02.prob
  def penultimate[T](xs : List[T]): T = xs.reverse.drop(1).head
  penultimate(List(1, 1, 2, 3, 5, 8)) == 5
}
