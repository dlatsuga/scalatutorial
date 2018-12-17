package udemy._1_oop_1._1_fields._1_override

object Person2Demo extends App {
  val person2 = new Person2

  //accessor demo
  val age = person2.age
  //mutator demo
  person2.age = 45

  //'parasites' mutators demo
  person2.age_$eq(45)
  person2.age_=(45)
}
