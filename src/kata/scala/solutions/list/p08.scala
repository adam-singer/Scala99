import Scala99._
import com.scalakata.eval._
@ScalaKata object P8_sol {
  P08.prob
  def compress[T](xs: List[T]): List[T] = {
    xs.foldRight(List.empty[T])( (h, r) =>
        if (r.isEmpty || r.head != h) h :: r
        else r
      )
  }
  compress(List()) == List()
  compress(List("a", "b", "a")) == List("a", "b", "a")
  compress(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")) == List("a", "b", "c", "a", "d", "e")
}
