package udemy._1_oop_1._1_fields._1_override

// 1. make field private -- will create private accessor & mutator
// 2. make filed private[this] -- will not create methods
// 3. rename field (to avoid conflict with accessor)
// 4. create accessor and mutator with default names

class Person3 {
  private[this] var privateAge: Int = _

  //accessor
  def age: Int = {
    println("Hello from accessor")
    privateAge
  }

  // mutator
  def age_=(value: Int){
    println("Hello from mutator")
    privateAge = value
  }
}
