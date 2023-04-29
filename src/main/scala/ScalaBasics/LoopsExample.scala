package ScalaBasics

//for loop
object ForLoop{
  def main(args:Array[String]): Unit = {
    var a = 10
    println("First for loop running...")
    for(a <- a to 20){
      println(a)
    }
    println("Second For loop running...")
    for(a <- a until(15)){
      println(a)
    }
  }
}


//While loop
object While{
  def main(args:Array[String]): Unit = {
    var a = 10

    while(a<=30)
//    while (true)        //Infinite while loop
    {
      println(a)
      a=a+2
    }
  }
}

//do while

object DoWhile{
  def main(args:Array[String]): Unit = {
    var a = 1
    println("Do While loop about to execute")
    do{
      println(a)
      a = a+2
    }
    while (a <=10)

  }
}




