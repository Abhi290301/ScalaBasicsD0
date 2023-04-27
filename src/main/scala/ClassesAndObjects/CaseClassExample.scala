package ClassesAndObjects
//First Program
case class CaseClassExample(a: Int ,b:Int)

 object Main1{
   def main(args:Array[String]): Unit = {
     val c = CaseClassExample(10, 10)

     println(c.a)
     println(c.b)
   }
 }


//Second Program
trait SuperTrait
case class CaseClassExample1(a:Int,b:Int)extends SuperTrait
case class CaseClassExample2(c:Int,d:Int) extends SuperTrait
case object CaseObject extends SuperTrait
object Main3{
  def callCase(f: SuperTrait): Unit = f match {

    case CaseClassExample1(f, g) => println("a =" + f + " b =" + g)
    case CaseClassExample2(f, g) => println("c = " + f + "d = " + g)
    case CaseObject => println("Case Object Entering the web!!!!")
  }
    def main(args:Array[String]): Unit = {
      callCase(CaseClassExample1(10,10))
      callCase(CaseClassExample2(20,30))
      callCase(CaseObject)


    }

}
