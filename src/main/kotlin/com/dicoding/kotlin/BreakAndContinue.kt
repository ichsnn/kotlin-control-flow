package com.dicoding.kotlin

fun breakAndContinue() {
  val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
  for (i in listOfInt) {
    print("$i ")
  }
  println() // output : 1 2 3 null 5 null 7

  for (i in listOfInt) {
    if (i == null) continue
    print("$i ")
  }
  println() // output : 1 2 3 5 7

  for (i in listOfInt) {
    if (i == null) break
    print("$i ")
  }
  println() // output : 1 2 3

  // identifier with @
  // example
  foo@ for (i in 1..10) {
    println("Outside loop")

    for (j in 1..10) {
      println("Inside loop")
      if (j > 5) break@foo
    }
  }
  // the all loop while break because we use label foo@
  /*
     output :
         Outside Loop
         Inside Loop
         Inside Loop
         Inside Loop
         Inside Loop
         Inside Loop
         Inside Loop
  */
}