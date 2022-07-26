package com.example.functionlagiv5

fun main () {
    val namae =setNamae(namae = "Putu erik cahyadi kun", age = 18)
    println(namae)
    printNamae(namae = "Putu erik cahyadi")

}fun setNamae(namae : String, age : Int) = "Watashi no namae wa $namae , my age is $age years old"
    fun printNamae(namae : String) {
    println("watashi no namae wa $namae ")
}