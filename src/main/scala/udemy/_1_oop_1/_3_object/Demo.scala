package udemy._1_oop_1._3_object

import udemy._1_oop_1._3_object.IntLib.max

object Demo extends App{
  println(max(5, 9))
}

object IntLib {
  val MAX_INT = java.lang.Integer.MAX_VALUE

  def max(x: Int, y: Int) = if (x > y) x else y
}
