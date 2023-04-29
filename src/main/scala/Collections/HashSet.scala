package Collections

import scala.collection.immutable.HashSet

object HashSet1 {

  def main (args: Array[String]): Unit =
  {
    var hashSet :HashSet[String] = HashSet("Abhishek","Abhinav","Anchal")
    hashSet.foreach((x:String) => println(x))
    println(hashSet.contains("A"))
    println(hashSet.toList)

  }
}
