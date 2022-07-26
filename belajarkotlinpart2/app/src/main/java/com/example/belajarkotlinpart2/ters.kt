package com.example.belajarkotlinpart2

fun main () {
    val Namae_No = setNamae_no(namae = "erik", age = 18)
    printNamae_no(Namae_No)
    printNamae_no(namae= "erik")
}
   fun setNamae_no(namae: String, age: Int) = "kimi no namae wa $namae, kimi no age $age"
fun printNamae_no(namae: String) {
    printNamae_no("kimi no namae wa $namae")
}