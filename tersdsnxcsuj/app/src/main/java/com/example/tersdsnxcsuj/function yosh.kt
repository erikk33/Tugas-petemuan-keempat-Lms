package com.example.tersdsnxcsuj

fun main () {
    val king = setKing (namae = "Erikun", age = 18)
    println(king)
    printlnKing(namae = "erikun")

} fun setKing(namae: String, age : Int) = "Kimi non namae wa $namae , your age is $age"
fun printlnKing(namae: String) {
    print("if you want go back $namae")
}