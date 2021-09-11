package Jubair.DIP

class BackendDeveloper extends Developer {
  override def develop(): Unit = {
    println(writeJava())
  }

  private def writeJava(): String= {
    return "Writing in java"
  }
}


