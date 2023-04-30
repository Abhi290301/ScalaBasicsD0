package BreakingNestedLoop

import scala.util.control._


object NestedLoopBreak {

  def main(args: Array[String]): Unit = {

    val x = List(10, 20, 30)
    val y = List(40, 50, 60)


    val outloop = new Breaks
    val inloop = new Breaks

    outloop.breakable {

      for (num1 <- x) {

        println(num1)

        inloop.breakable {

          for (num2 <- y) {
            println(num2)

            if (num2 == 50) {

              inloop.break

            }

          }

        }


      }
    }
  }
}