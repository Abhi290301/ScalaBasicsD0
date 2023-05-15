package Functions

object funcEx {
  //  Scala Function Example without using = Operator
  def functionExample() { // Defining a function
    println("This is a simple function")
  }
  def main(args: Array[String]): Unit = {
    functionExample() // Calling function
  }
}


  //Scala Function Example with = Operator
object Second {
    def functionExample() = { // Defining a function
      var a = 10
      a

    }
    def main(args: Array[String]) {
      var result = functionExample() // Calling function
      println(result)
    }


  }

//Scala Parameterized Function Example

object Third{
  def main(args: Array[String]) = {
    functionExample(10, 20)
  }

  def functionExample(a: Int, b: Int) = {
    var c = a + b
    println(c)
  }
}

//Scala Recursion Function

object Forth{
  def main(args: Array[String]) = {
    var result = functionExample(15, 2)
    println(result)
  }

  def functionExample(a: Int, b: Int): Int = {
    if (b == 0) // Base condition
      0
    else
      a + functionExample(a, b - 1)
  }
}

//Scala Function Parameter example with default value

object Fifth{

  def main(args: Array[String]) = {
    var result1 = functionExample(15, 2) // Calling with two values
    var result2 = functionExample(15) // Calling with one value
    var result3 = functionExample() // Calling without any value
    println("The result of first function : "+result1 +
      "\n"+ "The Result of second function : " + result2 +
      "\n"+ "The Result of second function : " + result3)
  }

  def functionExample(a: Int=0 , b: Int= 0): Int = { // Parameters with default values as 0
    a + b
  }
}

//Scala Function Named Parameter Example

object sixth{
  def main(args: Array[String]) = {
    var result1 = functionExample(a = 15, b = 2) // Parameters names are passed during call
    var result2 = functionExample(b = 15, a = 2) // Parameters order have changed during call
    var result3 = functionExample(15, 2) // Only values are passed during call
    println(result1 + "\n" + result2 + "\n" + result3)
  }

  def functionExample(a: Int, b: Int): Int = {
    a + b
  }
}