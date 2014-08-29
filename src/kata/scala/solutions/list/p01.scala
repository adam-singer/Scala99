import Scala99._
import com.scalakata.eval._
@ScalaKata object P01_sol {
  P01.prob
  def last[T](xs : List[T]): T = xs.last
  def last2(xs :List[Int]): Int = xs match {
    case h :: Nil  => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
  val list = List(1, 1, 2, 3, 5, 8)
  val expected = 8
  last(list) == expected
  last2(list) == expected
}
