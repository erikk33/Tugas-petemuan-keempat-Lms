package com.example.tesfunctiontrs

fun main () {
    val namae= setNamae(namae = "erikun", age = 18)
    println(namae)
    printNamae(namae = "erikun")
}

    fun setNamae(namae : String ,age: Int) = "watashi no namae wa $namae, my age is $age years old"

fun printNamae(namae : String) {
    println("watashi no namae wa $namae")
}
