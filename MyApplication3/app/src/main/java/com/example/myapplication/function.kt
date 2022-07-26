package com.example.myapplication
fun main() {
    val user = setUser( "Erik", age = 18)
    println(user)
    printUser(name = "Erik")
}
fun setUser(name: String, age: Int) = "Your name is $name, and your age $age"

fun printUser(name: String) {
    println("your name is $name")
}
/*
saddhbjh
grht
hyiy
 */

