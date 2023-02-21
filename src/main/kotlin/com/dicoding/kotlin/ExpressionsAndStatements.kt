package com.dicoding.kotlin

fun expressionsAndStatement() {
  val openOffice = 7
  val now = 8
  if (now > openOffice)
    print("Office already open")
  else
    print("Office close")

  val office = if (now > openOffice) "Office already open" else "Office close"

  println(sum(1, 1 + 4))

  val value1 = 10; // this is statement
  val value2 = 10; // this is statement

  sum(value1, value2) // this is expression
}

fun sum(value1: Int, value2: Int) = value1 + value2