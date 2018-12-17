package udemy._1_oop_1._1_fields._0_varval

object Person1Demo extends App {
  val person: Person1 = new Person1

  // accessor == getter
  val age = person.age

  // mutator == setter
//  person.age = 2 compilation error (val is final)
}
