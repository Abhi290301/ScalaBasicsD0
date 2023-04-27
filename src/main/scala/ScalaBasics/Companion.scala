package ScalaBasics

class CompanionClass {
  def hello(): Unit = {
    println("Hello ,I am companion class")
  }
}

object CompanionObject{
  def main(args:Array[String]): Unit = {
    new CompanionClass().hello()
    println("Hii I am Companion Object")
  }
}
