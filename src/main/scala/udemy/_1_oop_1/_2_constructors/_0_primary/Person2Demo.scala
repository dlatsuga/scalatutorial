package udemy._1_oop_1._2_constructors._0_primary

object Person2Demo extends App {
  val person2 = new Person2(34, "Vasya")

  val age = person2.age
  person2.age = 4

  val name = person2.name
//  person2.name = "Kolia" // val - final
}
