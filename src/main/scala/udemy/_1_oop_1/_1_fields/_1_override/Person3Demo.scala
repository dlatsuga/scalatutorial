package udemy._1_oop_1._1_fields._1_override

object Person3Demo extends App {
  val person3 = new Person3

  //accessor demo
  val age = person3.age
  //mutator demo
  person3.age = 67

  //'parasites' mutators demo
  person3.age_$eq(67)
  person3.age_=(67)
}
