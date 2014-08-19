import Scala99._
import com.scalakata.eval._
@ScalaKata object P01_P10 {
  problem(1, Easy, "Find the last element of a list")
  def last[T](xs : List[T]): T = {
  	xs .last
  }
  last(List(1, 1, 2, 3, 5, 8)) == 8
}
