package udemy._1_oop_1._1_fields._1_override

// 1. make field private -- will create private accessor & mutator
// 2. make filed private[this] -- will not create methods

class Person1 {
  private[this] var age: Int = _
}
