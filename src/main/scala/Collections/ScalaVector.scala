package Collections

object ScalaVector {
  def main(args: Array[String]): Unit = {

    //Initializing the vector
    var vector : Vector[Int] = Vector(1,2,3,4,5)

    //Starting the execution
    println("The Vector is ready to execute: ")
    println(vector)
    //Printing the size of the Vector
    println("The Vector size is: ")
    println(vector.size)
    //Updating the elements from the list
    println("Updating an element from the vector set with another")
    var updatedElement = vector.updated(2,10)
    println("Vector set after updating:")
    println(updatedElement)

  }

}
