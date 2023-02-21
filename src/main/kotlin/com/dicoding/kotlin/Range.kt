package com.dicoding.kotlin

fun range() {
  val rangeInt = 1..10 step 2
  println(rangeInt.step) // output : 1
  rangeInt.forEach {
    print("$it ")
  }
  println()

  val rangeInt2 = 1.rangeTo(10)
  val downInt = 10.downTo(1)

  downInt.forEach {
    print("$it ")
  }
  println()

  if (7 in downInt) {
    println("Value 7 is available")
  }
  if (11 !in downInt) {
    println("No value 11 in Range")
  }

  val rangeChar = 'A'.rangeTo('F')
  rangeChar.forEach {
    print("$it ")
  }
  println()

}