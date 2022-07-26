package com.example.latihanfunctiontrssampaipaham

fun main () {
    fun user() = setUser(namaez = "Erikun", age = 18)
    println(user())
    printUser(namaez = "Erikun")
}

    fun setUser(namaez: String,age : Int) = "Kimi no namae wa $namaez, My age is $age"

fun printUser(namaez: String) {
    println("your name is $namaez")
}
