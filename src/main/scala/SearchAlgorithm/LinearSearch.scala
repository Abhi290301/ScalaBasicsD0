package SearchAlgorithm

object LinearSearch {
  def search(arr: Array[Int], target: Int): Int = {
    for (i <- arr.indices) {
      if (arr(i) == target) {
        return i // return the index where the target is found
      }
    }
    -1 // return -1 if target is not found in the array
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(12,15,13,14,60,25,64,46,56)
    val target = 64
    val index = search(arr, target)
    if (index != -1) {
      println(s"Target $target found at index $index")
    } else {
      println(s"Target $target not found in the array")
    }
  }
}