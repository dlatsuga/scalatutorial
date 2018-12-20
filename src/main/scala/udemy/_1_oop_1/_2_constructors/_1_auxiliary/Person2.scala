package udemy._1_oop_1._2_constructors._1_auxiliary

class Person2(var name: String, var age: Int)

object Person2Demo extends App {

  new Person2("Mike", 45)
  new Person2(name = "Mike", 45)
  new Person2(name = "Mike", age = 45)

  new Person2(age = 34, name = "Vasya")
}
