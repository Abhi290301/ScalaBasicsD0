package ScalaBoilerPlate

import org.intellij.lang.annotations.Language


case class Example1(title: String, rating: Double)
  object Main {
    def main(args: Array[String]) {
      val CvsJava = Example1("C vs Java", 7.4)

      // Constructor parameters of the case class are class members.
      println(s"Language name: ${CvsJava.title} rating: ${CvsJava.rating}")
    }
}

//Other Example
case class Movie(title: String, rating: Double)
class AdFilm(title: String, lengthInSeconds: Int)

object Main2 {
  def main(args: Array[String]) {
    val fordVsFerrari: Movie = Movie("Ford vs Ferrari", 7.4)
    // Prints the string representation of the object.
    println(fordVsFerrari)
    val nikeAdFilm: AdFilm = new AdFilm("Nike Jordan", 185)
    // Prints the hash of the object.
    println(nikeAdFilm)
  }
}