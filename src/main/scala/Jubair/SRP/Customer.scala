package Jubair.SRP

class Customer {
  private var name: String = null
  private var address: String = null
  def getName: String = name
  def setName(name: String): Unit ={
    this.name = name
  }
  def getAddress: String = address
  def setAddress(address: String): Unit= {
    this.address = address
  }


}
