package Collections

import scala.collection.immutable.Queue

object QueueExample {
  def main(args: Array[String]): Unit = {
    var queue = Queue(1,2,3,4,5,6,7,8,9)
    //Printing the Queue
    println("Queue looks like: "+queue)

    //printing first element of the queue
    println("First element of the queue is: "+queue.front)
    //Last element of the Queue
    println("last element of the queue is: "+queue.last)
    //printing tail of the Queue
    println("Tail elements of the queue is: "+queue.tail)

    var  deque = queue.dequeue
    println(deque)

    var enque = queue.enqueue(10,12,16)
    println(enque)
  }
}
