package Collections

import scala.collection.immutable.ListSet

object ListSetEx {
  def main(args: Array[String]): Unit = {

    //Creating a empty list set with constructor
    var listSetEx :ListSet [String] = new ListSet()

    //Creating a empty list set with empty method
    var listSetEx1 :ListSet [Int] = ListSet.empty

    //lists Before Adding any element
    println("Elements in the ListSet1 Before Adding "+listSetEx.size)
    println("Elements in the ListSet2 Before Adding "+listSetEx1.size)

    //adding the the elements in the List1
    listSetEx += "Abhishek"
    listSetEx += "Abhinav"
    listSetEx += "Anchal"
    listSetEx += "Nitika"

    //adding the the elements in the List2
    listSetEx1 += 1
    listSetEx1 += 2
    listSetEx1 += 3
    listSetEx1 += 4

    //After adding the elements in the list
    println("Elements in the listSet1 After Adding "+listSetEx)
    println("Size of the ListSet1 After Adding " + listSetEx.size)

    println("Elements in the listSet1 After Adding "+listSetEx1)
    println("Size of the the ListSet2 After Adding " + listSetEx1.size)


  }

}
