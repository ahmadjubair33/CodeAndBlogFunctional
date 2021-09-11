package Jubair.DIP

import scala.collection.immutable.List

object Main extends App {
  val fruit: List[Developer] = List((new fronEnd), (new BackendDeveloper))
  val f = new DIP(fruit)

  println("Hello world")
}
