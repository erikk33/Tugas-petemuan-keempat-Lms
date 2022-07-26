package com.example.latihanfunc100work

fun main () {
    val id_me = setId_me(namae = "erik kun", age =18)
    println(id_me)
    printid_me(namae = "erik kun")
}
fun setId_me(namae : String, age: Int) = "Kimi no namae wa $namae, kimi no $age years old"
fun printid_me(namae: String) {
    println("nama kamu adalah $namae")
}
