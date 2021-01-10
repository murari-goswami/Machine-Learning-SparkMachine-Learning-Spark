package com.murari

object LuckyNumberSeven {

  def main(args: Array[String]): Unit = {
    val num = List(3, 5, 7, 232, 5)
    println("Sum of list of integers " + sumOfListOfInteger(num))

  }

  def sumOfListOfInteger(intList: List[Int]): Int = {
    intList.reduceLeft((x, y) =>  (if(x==7){x+7}else x) + (if(y==7){y+7} else y))
  }
}
