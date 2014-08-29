import Scala99._
import com.scalakata.eval._
@ScalaKata object P5_sol {
  P05.prob
  def reverse[T](xs: List[T]) = xs.reverse
  reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1)
}
