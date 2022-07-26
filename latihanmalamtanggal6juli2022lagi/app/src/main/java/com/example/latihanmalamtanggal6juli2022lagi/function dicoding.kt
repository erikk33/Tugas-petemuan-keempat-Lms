package com.example.latihanmalamtanggal6juli2022lagi

fun main () {
    val gos_namae = setGos_namae(namae = "Erik_kun" , age = 18)
    println(gos_namae)
    printlnGos_namae(namae = "Erik_kun")

}
fun setGos_namae (namae: String, age : Int) = "Anata no namae wa $namae , Your age is $age years old"
fun printlnGos_namae(namae: String) {
    println("Ohayou gozaimasu , Konichiwa, Konbanwa $namae")
}