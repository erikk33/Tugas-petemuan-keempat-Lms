package com.example.helloworld.latihan

fun main () {
//basic null
    val sese : String? = null
    sese?.length

    //elvis null
    val sesew : String? = null
    val sesewLength = sesew?.length ?:121212

    //if else nulll
    val sesewar: String? = null
    if (sesewar != null){}
    else 2323

    //no point null
    val seseawra : String? = null
    val seseawara = seseawra!!.length
}

