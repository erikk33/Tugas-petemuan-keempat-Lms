package com.example.helloworld

fun main (){
    //normal null
    val sert : String? = null
    sert?.length


    //elvis null
    val seee : String? = null
    val seeLength = seee?.length ?:1212
}