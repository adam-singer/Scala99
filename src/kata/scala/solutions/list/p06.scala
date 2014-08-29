import Scala99._
import com.scalakata.eval._
@ScalaKata object P6_sol {
  P06.prob
  def isPalindrome[T](xs: List[T]): Boolean = P5_sol.reverse(xs) == xs
  isPalindrome(List(1, 2, 3, 2, 1)) == true
}
