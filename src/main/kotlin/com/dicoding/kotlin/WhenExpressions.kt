package com.dicoding.kotlin

import kotlin.random.Random

fun whenExpression() {
  val value = 7

//  when (value) {
//    6 -> println("value is 6")
//    7 -> println("value is 7")
//    8 -> println("value is 8")
//    else -> println("value cannot be reached")
//  }

  val stringOfValue = when (value) {
    6 -> "value is 6"
    7 -> "value is 7"
    8 -> "value is 8"
    else -> "value cannot be reached" // if the else not include, it's will error
  }

  val anyType : Any = 100L
  when(anyType){
    is Long -> println("the value has a Long type")
    is String -> println("the value has a String type")
    else -> println("undefined")
  }

  val somevalue =  27
  val ranges = 10..50

  when(somevalue){
    in ranges -> println("value is in the range")
    !in ranges -> println("value is outside the range")
    else -> println("value undefined")
  }

  val registerNumber = when(val regis = getRegisterNumber()){
    in 1..50 -> 50 * regis
    in 51..100 -> 100 * regis
    else -> regis
  }

  println(stringOfValue)
}

fun getRegisterNumber() = Random.nextInt(100)