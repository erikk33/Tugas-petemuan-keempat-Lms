package com.example.latihanfunctionnow_2jw

fun main () {
    val watashi = setWatashi(namae = "Erikun", age = 18)
    print(watashi)
    printlnWatashi(namae = "erikun")


}
fun setWatashi(namae: String, age : Int) = "Boku wa namae $namae , your age is $age years old"
fun printlnWatashi(namae: String) {
    "kimi no namae wa $namae"
}