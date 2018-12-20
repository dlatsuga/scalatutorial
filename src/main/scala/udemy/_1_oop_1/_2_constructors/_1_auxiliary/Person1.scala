package udemy._1_oop_1._2_constructors._1_auxiliary

class Person1 (var name: String = "Mike", var age: Int = 45)

object Person1Demo extends App {

  new Person1()

  new Person1("Vasya")

  new Person1(age = 46)

  new Person1("Kolya", 35)
}