package Collections

object ListExample {
  def main(args: Array[String]): Unit = {
    var list :List[Int] = List(10,11,30,21,25,65,53)
    println("Elements inlist1 are: "+list)

    var list2 =List(88,64,35,56)
    println("Elements in list2 are: "+list2)

    var mergeLists = list++list2

    mergeLists.foreach((element:Int)=>print(element+" "))

    println("\nSize of the list after merging two listS: "+mergeLists)

    println("After sorting the merge list"+mergeLists.sorted)

    println("Reverse order of the list: "+(mergeLists.sorted).reverse)
  }

}
