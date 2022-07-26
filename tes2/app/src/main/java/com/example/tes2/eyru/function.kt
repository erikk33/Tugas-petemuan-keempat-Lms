package com.example.tes2.eyru


fun main () {
    val japan = setJapan(namae = "Erikun", age = 18)
    println(japan)
    printJapan(namae = "Erikun")

}fun setJapan(namae: String, age: Int) = "boku no namae wa $namae, kimi no age $age"
fun printJapan(namae: String) {
   println("sore ja no boku wa namae $namae")
}