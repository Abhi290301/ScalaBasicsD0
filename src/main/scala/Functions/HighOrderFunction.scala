package Functions

object HighOrderFunction {
//  Passing a Function as Parameter in a Function
def main(args: Array[String]) = {
  functionExample(25, multiplyBy2) // Passing a function as parameter
}

  def functionExample(a: Int, f: Int => AnyVal): Unit = {
    println(f(a)) // Calling that function
  }

  def multiplyBy2(a: Int): Int = {
    a * 2
  }
}

//Function Composition
object HOF2{
  def main(args: Array[String]): Unit = {
    var result = multiplyBy2(add2(10)) // Function composition
    println(result)
  }

  def add2(a: Int): Int = {
    a + 2
  }

  def multiplyBy2(a: Int): Int = {
    a * 2

}
}

//Lamda/Anonymous Function
object HOF3{
  def main(args: Array[String]) = {
    var result1 = (a: Int, b: Int) => a + b // Anonymous function by using => (rocket)
    var result2 = (_: Int) + (_: Int) // Anonymous function by using _ (underscore) wild card
    println(result1(10, 10))
    println(result2(10, 10))
  }

}
