package ClassesAndObjects

 class ScalaClass {
            //Names
             val name1 = "Abhishek Chandel"
             val name2 = "Anchal Bhatt"
             val name3 = "Akash"

            //Ages

             var age1 = 22
             var age2 = 21
             var age3 = 23

         def show(): Unit = {
             println(s"Hello My name is $name1 and My age is $age1")
             println(s"Hello My name is $name2 and My age is $age2")
             println(s"Hello My name is $name3 and My age is $age3")
         }

    }
 object Main{
    def main(args:Array[String]): Unit = {
        var ob =new ScalaClass()
        ob.show()
    }
}