package ClassesAndObjects

object PatternMatching extends App{
  var name ="Abhishek"
  name match {
  case "Abhishek" => println("Hello Roll no. 1902031001")
    case "Abhinav" => println("Abhinav is here")
    case _ => println("Nothing is matched")
  }

}
