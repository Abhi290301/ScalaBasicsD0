package Collections

import cats.FlatMap

object FlatMapEx {
  def main(args: Array[String]): Unit = {
    var list =List(1,2,3,5)
    println("List before Flatmap :")
    println(list)
    var fMap = list.flatMap(f=> List(f,f+2))
    println("List after the flatmap :")
    println(fMap)
    var list2 =List("Abhishek","Vishal")
    var fMap2 = list2.flatMap(x => x.toUpperCase())
    var fMap3 = list2.flatMap(_.toUpperCase())
    println(fMap2)
  }
}
