package udemy._1_oop_1._2_constructors._0_primary

object Person1Demo extends App {
  val person1 = new Person1(45)

  // accessor == getter
  val age = person1.age

  // mutator == setter
  person1.age = 1
}
