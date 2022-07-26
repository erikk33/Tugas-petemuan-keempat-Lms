package com.example.tesdnsdj
//function return
fun main () {
    val erik_xn = setErik_xn(namae = "Erik kun", age = 18)

    println(erik_xn)
    printErik_xn(namae = "Erik kun")
} fun setErik_xn(namae : String, age : Int) = "Yukinon yukinon shita your name is $namae, kimi no age $age years old"
fun printErik_xn(namae: String) {
    println("kimi no namae wa $namae")
}