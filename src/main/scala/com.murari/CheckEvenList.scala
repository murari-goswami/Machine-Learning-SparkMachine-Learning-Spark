package com.murari

object CheckEvenList {

  def main(args: Array[String]): Unit = {
    val evenList = List(2, 54, 3, 6)
    val oddList = List(1, 7, 45, 67)

    println("Check for even list when passing even list " + checkListEven(evenList))
    println("Check for even list when passing even list " + checkListEven(oddList))
  }

  def checkListEven(num: List[Int]): Boolean = {
    for (n <- num) {
      if (n % 2 == 0) {
        return true
      }
    }
    return false
  }
}