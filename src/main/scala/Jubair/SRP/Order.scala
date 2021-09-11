package Jubair.SRP

import java.util.Random

class Order {
  private var customer = new Customer
  private var orderId: String = ""
  private var itemName: String = ""
  private var quantity = 0
  private var totalBillAmt = 0

  def getCustomer: Customer = customer

  def setCustomer(customer: Customer): Unit = {
    this.customer = customer
  }

  def getOrderId: String = orderId

  def setOrderId(orderId: String): Unit = {
    val random = new Random
    this.orderId = orderId + "-" + random.nextInt(500)
  }

  def getItemName: String = itemName

  def setItemName(itemName: String): Unit = {
    this.itemName = itemName
    setOrderId(itemName)

  }

  def getQuantity: Int = quantity

  def setQuantity(quantity: Int): Unit = {
    this.quantity = quantity
  }

  def getTotalBillAmt: Int = totalBillAmt

  def setTotalBillAmt(totalBillAmt: Int): Unit = {
    this.totalBillAmt = totalBillAmt
  }

}
