package com.example.helloworld.latihan

import java.sql.Statement

fun main () {

    //tes text pertama
    val sahsj : String = "skskadasdakd"
    val firstString = sahsj[7]
    println(firstString)

    //loop
    val sajdjsa : String = "sdkkadkas"
    for (Char in sajdjsa) {
        println(Char)

        //escape string
        val sajas : String = "Unicode tes /29292292"
        println(sajas)

        //escape string
        var remnsa : String = "Unicode cod /@2920129"
        println(remnsa)

        //raw string
        val asd : String = "line1 1\n" +
                "line 2 2\n" +
                "line 33\n"
        println(asd)

    }


    //cara memberi titik dua dalam text string
    val Statement = "coding adalah \"imajinasiku\""
    print(Statement)

}