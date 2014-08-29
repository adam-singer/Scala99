import Scala99._
import com.scalakata.eval._
@ScalaKata object P7_sol {
  P07.prob
  // def flatten[T](xs: List[List[T]]): List[T] = xs.flatten.to[List]
  def flatten(xs: List[Any]): List[Any] = {
    xs flatMap {
      case vs: List[_] => flatten(vs)
      case v => List(v)
    }
  }
  flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8)
}
