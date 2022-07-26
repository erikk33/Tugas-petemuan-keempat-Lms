package com.example.helloworld.latihan

fun main () {
    val hseis =Sethseis(namae = "erikun", age = 18)
    println(hseis)
    printHseis(namae = "erikun")

} fun Sethseis(namae : String, age : Int) = "kimi no namae wa $namae, to age on $age"
fun printHseis(namae: String) {
    print("kimi no namae wa $namae")
}

