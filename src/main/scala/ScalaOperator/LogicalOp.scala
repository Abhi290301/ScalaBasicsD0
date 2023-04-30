package ScalaOperator

object LogicalOp {
  def main(args: Array[String]): Unit = {


      // variables
      var a = false
      var b = true

      // logical NOT operator
      println("Logical Not of !(a && b) = " + !(a && b))

      // logical OR operator
      println("Logical Or of a || b = " + (a || b))

      // logical AND operator
      println("Logical And of a && b = " + (a && b))

    }
}
