package ScalaBasics

object Singleton {
  def main(args:Array[String]): Unit = {
    SingletonObject.hello()
  }

}
object SingletonObject {
  def hello(): Unit = {
    println("Hello Singleton")
  }
}