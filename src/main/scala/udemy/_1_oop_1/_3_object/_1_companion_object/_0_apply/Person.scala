package udemy._1_oop_1._3_object._1_companion_object._0_apply

class Person(val name: String, val age: Int)

object Person {
  val MAX_AGE = 256
  val MAX_NAME_LENGTH = 1024

  def apply(name: String, age: Int) = new Person(name, age)
}

object PersonDemo extends App {
  val person0 = new Person("Mike", 45)

  val person1 = Person.apply("Mike", 47)

  val person2 = Person("Mike", 83)
}