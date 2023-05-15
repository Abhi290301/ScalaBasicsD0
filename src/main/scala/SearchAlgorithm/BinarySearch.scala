package SearchAlgorithm

object BinarySearch {
  var arr = Array(3,2,5,40,10,15,14,30,80,70,40)
  def RecursiveBinarySearch(arr1: Array[Int],
                            Element_to_Search: Int)
                           (low: Int = 0,
                            high: Int = arr1.length - 1): Int = {



    // If element not found
    if (low > high)
      return -1

    // Getting the middle element
    var middle = low + (high - low) / 2

    // If element found
    if (arr1(middle) == Element_to_Search)
      return middle

    // Searching in the left half
    else if (arr1(middle) > Element_to_Search)
      return RecursiveBinarySearch(arr1,
        Element_to_Search)(low, middle - 1)

    // Searching in the right half
    else
      return RecursiveBinarySearch(arr1,
        Element_to_Search)(middle + 1, high)
  }

  // Creating main function
  def main(args: Array[String]) {

    // Calling the binary search function and
    // storing its result in index variable
    val sortedArray = arr.sorted

    println("Sorted array: ")

//    for (i <- sortedArray.indices) {
//      print(sortedArray(i) + " ")
//    }
//    println()

    var index = RecursiveBinarySearch(sortedArray,80)(0, 10)

    // If value not found
    if (index == -1)
      print("Not Found")

    // Else print the index where
    // the value is found
    else
      print("Element found at Index " + index)
  }

}



//2nd

object BinarySearch1 {
  var arr = Array(3, 2, 5, 40, 10, 15, 14, 30, 80, 70, 40)

  def RecursiveBinarySearch(arr1: Array[Int],
                            Element_to_Search: Int)
                           (low: Int = 0,
                            high: Int = arr1.length - 1): Int = {

    // If element not found
    if (low > high)
      return -1

    // Getting the middle element
    var middle = low + (high - low) / 2

    // If element found
    if (arr1(middle) == Element_to_Search)
      return middle

    // Searching in the left half
    else if (arr1(middle) > Element_to_Search)
      return RecursiveBinarySearch(arr1,
        Element_to_Search)(low, middle - 1)

    // Searching in the right half
    else
      return RecursiveBinarySearch(arr1,
        Element_to_Search)(middle + 1, high)
  }

  // Creating main function
  def main(args: Array[String]) {

    // Sorting the array
    val sortedArray = arr.sorted

    // Printing the sorted array
    println("Sorted array: ")
    for (i <- sortedArray.indices) {
      print(sortedArray(i) + " ")
    }
    println()

    // Calling the binary search function and
    // storing its result in index variable
    var index = RecursiveBinarySearch(sortedArray, 40)(0, 9)

    // If value not found
    if (index == -1)
      print("Not Found")

    // Else print the index where
    // the value is found
    else
      print("Element found at Index " + index)
  }

}
