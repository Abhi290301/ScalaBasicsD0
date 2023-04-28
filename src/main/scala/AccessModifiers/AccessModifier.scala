package AccessModifiers
//private Access Modifiers
class AccessModifier {
  private var name = "Abhishek"
  def draw(): Unit = {
    println(name)
  }

}
object Access{
  def main(args:Array[String]): Unit = {
    var p = new AccessModifier()
//    p.name=12    //calling private variable
    p.draw()
  }
}

//Protected Access Modifiers
class ProtectedMember{
  protected var name = "Chandel"
  def eg(): Unit = {
    println("Your Surname is  "+name)
  }
}
class SubClass extends ProtectedMember{
  def subClass(): Unit = {
    eg() //Calling protected access modifier
  }
}
object main7{
  def main(args:Array[String]): Unit = {
    var ob = new SubClass()
    ob.subClass()
  }
}