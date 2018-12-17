package oop1

class Demo {
  def f4(x: Int, y: Int) = x * x + y * y

  def f5(x: Int, y: Int): Int ={
    def sqr(t: Int) = t*t
    sqr(x) + sqr(y)
  }
}

object Main{
  def main(args: Array[String]): Unit = {
    println(new Demo().f4(1,5))
    println(new Demo().f5(1,5))
  }
}
