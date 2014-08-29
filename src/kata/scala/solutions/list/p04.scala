import Scala99._
import com.scalakata.eval._
@ScalaKata object P4_sol {
  P04.prob
  def length[T](xs: List[T]): Int = xs.length
  length(List(1, 1, 2, 3, 5, 8)) == 6
}
