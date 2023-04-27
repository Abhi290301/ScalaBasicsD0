object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

      val maybeString: Option[String] = Some("Hello, world!")
      val maybeLength: Option[Int] = maybeString.map(_.length)

      println(maybeLength)
    }

}