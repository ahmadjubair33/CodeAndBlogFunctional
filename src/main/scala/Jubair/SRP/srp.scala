package Jubair.SRP

object srp extends App {

  val customer = (name: String, address: String) =>{
    "Name: "+name+" Address: "+ address
  }
  val order = new Order
  order.setQuantity(2)
  order.getOrderId
  val BillCalculation = (order: Order) => {
    200 * order.getQuantity
  }
  print(customer("Jubair","Noida")+"\nTotal Bill Amount=")
  val deliverApp = new DeliverApp(BillCalculation(order))
 (deliverApp.printDelivery)
  (deliverApp.delivery)
}
