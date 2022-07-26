package com.example.myapplication

fun main () {
    val namae = setNamae(name = "Putu erik cahyadi", age = 18)
    println(namae)
    printnamae(name = "Putu erik cahyadi")
}
fun setNamae(name: String, age: Int) = "watashi no namae wa $name, my age is $age years old"

fun printnamae (name: String) {
    println("watashi no namae wa $name")
}