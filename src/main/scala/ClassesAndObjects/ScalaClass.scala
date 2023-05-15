package ClassesAndObjects
import scala.io.StdIn.readLine

class ScalaClass {
            //Names
             val name1 = "Abhishek Chandel"
             val name2 = "Anchal Bhatt"
             val name3 = "Akash"

            //Ages
     println(s"What is your age $name1 ?")
    var age1 = readLine()

    println(s"What is your age $name2 ?")
    var age2 = readLine()
    var age3 = 23

         def show(): Unit = {
             println(s"Hello My name is $name1 and My age is $age1")
             println(s"Hello My name is $name2 and My age is $age2")
             println(s"Hello My name is $name3 and My age is $age3")
         }

    }
class Demo2(id: Int ,name: String) {
  def str() {
    println {

      if (name == "Abhishek") {
        ("Abhishek is good person")
      } else {
        ("Abhishek is not a good person")

      }

    }

  }}


  object Main {
    def main(args: Array[String]): Unit = {
      var ob = new ScalaClass()
      ob.show()
      var ob1 = new Demo2(10, "Abhishek")
      ob1.str()
    }
  }


//Scala Class example
class Student(id:Int, name:String){     // Primary constructor
  def show(){
    println(id+" "+name)
  }
}
object MainObject{
  def main(args:Array[String]){
    var s = new Student(1902031001,"Abhishek Chandel")   // Passing values to constructor
    s.show()                // Calling a function by using an object
  }
}
