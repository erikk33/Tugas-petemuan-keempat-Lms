package com.example.latihanfunction

fun main () {
    val user = setUser(name = "Erikxzc",age=18)
    println(user)
    printUser(name="Erikxzc")
}
fun setUser(name: String,age: Int)= "your name is $name, old $age years old"
fun printUser (name: String) {
    println("your name is $name")
}