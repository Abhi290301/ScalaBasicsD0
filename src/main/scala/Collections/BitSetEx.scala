package Collections

import scala.collection.immutable.BitSet

object BitSetEx {
  def main(args: Array[String]): Unit = {
    // Create a new bitset with 10 bits
    var bitSet = BitSet(1, 3, 5, 7, 9)

    // Print the bitset
    println("BitSet: " + bitSet)

    // Add an element to the bitset
    bitSet += 11

    // Print the bitset again
    println("BitSet after adding 11: " + bitSet)

    // Remove an element from the bitset
    bitSet -= 5

    // Print the bitset again
    println("BitSet after removing 5: " + bitSet)

    // Check if an element exists in the bitset
    val containsSeven = bitSet(7)
    println("BitSet contains 7: " + containsSeven)

    // Convert the bitset to an array
    val bitSetArray = bitSet.toArray
    println("BitSet as array: " + bitSetArray.mkString(", "))

    val bitSetList = bitSet.toList
    println("BitSet as an List: "+bitSetList)
  }
}
