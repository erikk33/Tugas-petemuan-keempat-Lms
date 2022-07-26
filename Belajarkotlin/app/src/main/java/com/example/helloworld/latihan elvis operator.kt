package com.example.helloworld
fun main () {
    //standard null
   val bsje : String? = null
    bsje?.length

    val bsue : String? = null
    if (bsue != null) {
        var valbsueLength = bsue.length
    }



    //elvis null
    val ghse: String? = null
    val ghseLength = ghse?.length ?:991


    //if else nulls
    val ghsee = if (ghse != null){}
   else 23293

    //non null asertation
    val ghoe : String? = null
    val ghoeLength = ghoe!!.length

//elvis null
    val base : String? = null
    val baseLength = base?.length ?:212121

    //elvis null
    val snwie : String? = null
    val snwieLength = snwie?.length ?:212012

    val sdjdiee : String? = null
    sdjdiee?.length
}