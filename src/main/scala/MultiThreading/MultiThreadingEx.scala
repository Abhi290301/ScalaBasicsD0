package MultiThreading


//By extending Thread Class
class MultiThreadingEx extends Thread{
  override def run() {
    // Displaying the thread that is running
    println("Thread " + Thread.currentThread().getName +
      " is running.")
  }
}

// Creating object
object MultiThreading {
  // Main method
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 5) {
      var th = new MultiThreadingEx()
      th.setName(x.toString)
      th.start()
    }
  }
}


//By Extending Runnable Interface

class Threading extends Runnable {
  override def run(): Unit = {
    //Displaying thread is running
    println(s"Thread ${Thread.currentThread().getName} is running" )
  }
}

object Threading1 {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 7) {
      var obj = new Thread(new Threading())
      obj.setName(x.toString)
      obj.start()
    }
  }
}