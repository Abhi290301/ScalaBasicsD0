package AnonymousFunctions

object AnonExample {
  def main(args: Array[String]): Unit = {

    //Creating an anonymous function
    var myfc1 = (str1:String,str2:String) =>str1 + str2

    var myfc2 = (_:String) + (_:String)

    println(myfc2("Abhishek"," Chandel"))
    println(myfc1("2nd","String"))

    // Creating anonymous functions
    // without parameter
    def myfnc = () =>{
      "Welcome to Anonymous Function"
    }
    println(myfnc())

    // A function which contain anonymous
    // function as a parameter
    def p_func(fun:(String,String,String,String)=>String)=
    {
        fun("Hello"," i"," am"," Abhishek")
    }

    // Explicit type declaration of anonymous
    // function in another function
    val f1 = p_func((str1: String,
                         str2: String,str3:String,str4:String) => str1 + str2 +str3 +str4)

    var output=p_func(_+_+_+_).toUpperCase()
    println(output)
  }

}
