package Collections

object StreamScala {
  def main(args: Array[String]): Unit = {
    var stream = Stream(10,20,30)
    var stream2 = 100#::200#:: Stream.Empty
    println(stream)
    println(stream2)
    println("First Element of the Stream is : "+stream.head)
    println("Size of the Stream is : "+stream.size)
    println(" Stream contains 10 T/F : "+stream.contains(10))
  }
}
