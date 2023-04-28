package ClassesAndObjects

import scala.io.StdIn.readLine

trait Printable{
  def print()

}
trait Drawable{
  def draw()

}
class Traits extends Printable with Drawable {
  def print() {
    println("Enter Language Name:")
    var Lname = readLine()
    println("Enter Author Name:")
    var Author = readLine()

  }
  def draw() {
    println("Scalalalalalalalalalalalala............................")
  }
}

object Main6{
  def main(args:Array[String]): Unit = {
    val ob = new Traits()
    println("\nPrintable Trait is starting....")
    ob.print()
    println("\n \n Drawable Trait is starting....")
    ob.draw()
  }
}