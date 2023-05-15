package BreakingNestedLoop

import scala.util.control.Breaks._

object BreakStatement {
  def main(args: Array[String]): Unit = {
    breakable {
      for (a <- 1 to 10) {
        if (a == 6)
          break
        else
          println(a)
      }
    }
  }
}