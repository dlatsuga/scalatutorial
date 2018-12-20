package udemy._1_oop_1._3_object._1_companion_object._1_scope

class PrivatDemo {
  private val classPrivate = 0
  val tmp = PrivatDemo.objectPrivate
}

object PrivatDemo {
  private val objectPrivate = 2
  val tmp = new PrivatDemo().classPrivate
}
