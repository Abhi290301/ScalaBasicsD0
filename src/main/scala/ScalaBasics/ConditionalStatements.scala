package ScalaBasics

import scala.io.StdIn.readLine

object ConditionalStatements {
  def main(args:Array[String]): Unit = {
    println("Enter You Age Sir/Madam")
    val age = readLine().toInt
    if(age>=18 && age<60){
      println("You can apply for the driving license")
    }
    else if(age<18) {
      println("You are a minor.You can't apply for the license.")
    }
    else {
      println("You are over age for applying the driving license.")
    }
  }

}
