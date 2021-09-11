package Jubair.DIP

class fronEnd extends Developer {
  override def develop(): Unit = {
    println(writeJavascript())

  }

  def writeJavascript(): String = {
    return "writing in js"
  }

}
