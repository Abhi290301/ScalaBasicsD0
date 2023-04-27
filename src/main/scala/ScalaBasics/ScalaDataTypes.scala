package ScalaBasics

object ScalaDataTypes {
  def main(args:Array[String]): Unit = {
    val integer :Int = 100
    val char :Char = 'A'
    val float :Float = 1


    val double : Double = 1.0

    //default value of Boolean is false
    val boolean :Boolean =true

    if(boolean==null){
      println("Boolean :"+boolean)
    }
    println("Integer :" +integer)
    println("Char :" +char)
    println("Float :" +float)
    println("Double :" +double)

  }

}
