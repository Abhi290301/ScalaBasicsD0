package Collections

import scala.collection.immutable.Nil.foreach
import scala.collection.immutable._
object SetEx{
  def main(args:Array[String]): Unit = {
    var names = Set("Abhishek","Abhinav","Shubham","Akash","Vishal","C")
    var games = Set("Hockey","Cricket","Abhishek","Hurdles","Volley Ball","Marathon","C")
    val mergeSet= names++games //
    println(names)
    println(games)
    println(games.head)  //return first element
    println(games.tail)  //returns elements accept first
    println(games.isEmpty)  //check wheather the set is empty or not
    println(games.size)  //return the size of the set
    println(names.size)
    println(mergeSet.size)
    println(mergeSet.isEmpty)
    println(mergeSet)
    games += "Carrom"   //Add carrom to the set
    names -= "Nitika"  //Remove Nitika from the Set
    var mergeSet1= names++games
    println(mergeSet1.contains("Abhishek"))  //Check if set contain Abhishek or not and will return true and false
    println(mergeSet1.contains("Z"))   //Check if set contain Z or not and will return true and false
    println("Intersection of set "+games.intersect(names)) //check the common in the sets and print that common only
    println(mergeSet.union(mergeSet1)) //combine sets and print common arguements as one
    println("The Size of set after union:" +(mergeSet.union(mergeSet1)).size)
    println("For loop elements :")
    for (game1 <- mergeSet1){
      println(game1)
    }
    println("For Each Elements :")
    mergeSet1.foreach((game:String) => println(game))  //Run a iterator to print all the elements in the list

    //Sorting in the sets
    var sortedSet = SortedSet(10,58,8,25,36,98,65,24,88)
    println(sortedSet)
    sortedSet.foreach((elements:Int) => println(elements))

  }
}