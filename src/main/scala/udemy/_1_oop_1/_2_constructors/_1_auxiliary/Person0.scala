package udemy._1_oop_1._2_constructors._1_auxiliary

import udemy._1_oop_1._2_constructors._1_auxiliary.Person0.{DEFAULT_AGE, DEFAULT_NAME}

class Person0 (var name: String, var age: Int) {
  def this(age: Int){
    this(DEFAULT_NAME, age)
  }

  def this(name: String){
    this(name, DEFAULT_AGE)
  }

  def this(){
    this(DEFAULT_NAME, DEFAULT_AGE)
  }
}

object Person0{
  val DEFAULT_NAME = "XXX"
  val DEFAULT_AGE = 35
}
