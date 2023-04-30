package Collections

object Sequence {
  def main(args: Array[String]): Unit = {
    var seq1 :Seq[Int] =  Seq(1,2,5,678,5474,576,2,58,2,5,54,5)
    println("Size of the Set is :"+seq1.size)
    println("The sequence will be: "+seq1.nonEmpty)
    println(seq1)
    println("The last index of 3: " +seq1.lastIndexOf(3))
    println("The last index of 3: " +seq1.lastIndexOf(5))
    println("For each method is progressing: ")
    seq1.foreach(e => println( e))
    println("Sequence ends with (54,5): "+seq1.endsWith(Seq(54,5)))

    println("Reverse Order of the sequence"+seq1.reverse)

  }

}
