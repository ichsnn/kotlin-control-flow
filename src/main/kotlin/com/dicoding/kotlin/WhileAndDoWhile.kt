package com.dicoding.kotlin

fun whileAndDoWhile() {
  var counter1 = 1

  while (counter1 <= 7) {
    println("Hello, World!")
    counter1++
  }
  println(counter1)
  while (counter1 <= 7) {
    println("Hello, World! From End") // this is will not be printed cause the counter while check first
  }
  println()
  /*
   output :
     Hello, World!
     Hello, World!
     Hello, World!
     Hello, World!
     Hello, World!
     Hello, World!
     Hello, World!
  */

  var counter2 = 1

  do {
    println("Hello, World!") // this will printed because the counter while check after this line executed
    counter2++
  } while (counter2 <= 7)
  println(counter2)

  do {
    println("Hello, World! From End")
  } while (counter2 <= 7)

  /*
   output:
     Hello, World!
     Hello, World!
     Hello, World!
     Hello, World!
     Hello, World!
     Hello, World!
     Hello, World!
  */

  // Infinite Loop
  // =============
  // var value = 'A'
  // do {
  //   print(value)
  // } while (value <= 'Z')
}
