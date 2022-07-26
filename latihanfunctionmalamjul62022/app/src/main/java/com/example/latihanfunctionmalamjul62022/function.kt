package com.example.latihanfunctionmalamjul62022
//function return
fun main (){
    val namae_no = setNamae_no(namae = "Erik kun", Age = 18)
    println(namae_no)
    printNamae_no(namae = "Erik kun")
}
fun setNamae_no(namae: String, Age : Int) = "Anata no namae wa $namae , Your age is $Age"
fun printNamae_no(namae: String)  {
    println("anata no namae wa $namae")
}