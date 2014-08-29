import Scala99._
import com.scalakata.eval._
@ScalaKata object P11_sol {
  P11.prob
  def encodeModified[T](xs: List[T]): List[(Int, T)] = {
     P9_sol.pack(xs) map(v => (v.length, v.head))
  }
  encodeModified(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")) ==
    List((4,"a"), (1,"b"), (2,"c"), (2,"a"), (1,"d"), (4,"e"))
}
