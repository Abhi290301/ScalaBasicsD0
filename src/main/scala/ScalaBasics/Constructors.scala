package ScalaBasics

//Default Constructor
class Constructors {
  def default(): Unit = {
    println("This is default Constructor")
  }

}
object Construct{
  def main(args:Array[String]): Unit = {
    var ob = new Constructors()
    ob.default()
  }
}

//Primary Constructors
class Primary(name:String="Anchal",rollno:Int=1902031006){
  def primConstructor(): Unit = {

    println(s"The name of the student is $name and Roll No. is $rollno")

  }
}
object priConstructor{
      def main(args:Array[String]): Unit = {
            val ob = new Primary("Abhishek", 1902031001)
            ob.primConstructor()
            val ob1 = new Primary()
            ob1.primConstructor()
      }
  }

//Auxillary Constructor

class Auxillary(){
  
}