package com.dicoding.kotlin

fun enumeration() {
  val colorRed = Color.RED
  val colorGreen = Color.GREEN
  val colorBlue = Color.BLUE

  val color2r = Color2.RED
  println(color2r)
  val color2b: Color2 = Color2.BLUE
  println(color2b)

  val color3: Color3 = Color3.RED
  println(color3.value)
  println(color3.value.toString(16))
  color3.printValue()
  println()

  val colors: Array<Color3> = Color3.values()
  colors.forEach { color3 ->
    color3.printValue()
    println("ordinal: ${color3.ordinal}")
  }
}

enum class Color(val value: Int) {
  RED(0XFF0000),
  GREEN(0X00FF00),
  BLUE(0X0000FF)
}

enum class Color2 {
  RED, GREEN, BLUE
}

enum class Color3(val value: Int) {
  RED(0XFF0000) {
    override fun printValue() {
      return println("Value of RED is $value")
    }
  },
  GREEN(0X00FF00) {
    override fun printValue() {
      return println("Value of GREEN is $value")
    }
  },
  BLUE(0X0000FF) {
    override fun printValue() {
      return println("Value of BLUE is $value")
    }
  };

  abstract fun printValue()
}