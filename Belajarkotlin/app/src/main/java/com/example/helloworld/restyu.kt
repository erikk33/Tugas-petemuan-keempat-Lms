package com.example.helloworld

fun main (Args:Array<String>) {
    print("User name = ")
    var tyo : String = """
        >Ohayou gozaimasu
        >Konichiwa 
        >Konbanwa
        """.trimMargin(">")
    var userN = readLine()
    println("Last name = ")
    var userL = readLine()
    var bio : String = "$userN $userL"
    println(bio)
    var biov2 : String = "$bio Length = ${bio.length}"
    println(biov2)


}