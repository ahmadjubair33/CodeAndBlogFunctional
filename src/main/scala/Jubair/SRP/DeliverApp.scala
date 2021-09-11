package Jubair.SRP

 case class DeliverApp(order: Int ) {
  def printDelivery ={
    println(order)
  }
  def delivery = {
    System.out.println("Delivered the order")

  }
}
