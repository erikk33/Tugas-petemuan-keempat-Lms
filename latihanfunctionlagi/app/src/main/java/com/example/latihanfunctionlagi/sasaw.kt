package com.example.latihanfunctionlagi
fun main () {
    val user = setUser(namae = "erikkun", age = 18)
    println(user)
    printUser(namae = "erikkun")
}
    fun setUser(namae :String,age : Int)="your name is $namae, your age is $age"

    fun printUser(namae : String) {
        println("your name is $namae")

}