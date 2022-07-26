package com.example.helloworld

import java.sql.Statement

fun main () {
    var res : String = "mizuharaa chizuru rensan"
    var firstChar = res[9]

    println(firstChar)

    var fuyuhi_chan = 's'
    println("fuyuhi chan" + fuyuhi_chan++)

    var tersy = 'p'
    println("tersy" + tersy--)

    var mizuhara : String = "Beatiful"
    var chizuru : String = "Girl"
    println(mizuhara + chizuru)


    //unicode string
    fun main() {
        val name = "Unicode test: \u00A9"
        print(name)
    }
    //unicode string

        val namae = "Uniccode test : \u00A1"
        println(namae)
   //loop
    var besstie : String = "snow way to run"
    for (char in besstie) {
        println(char)
    }
    //raw string
    var gos : String = "anyone to know 1\n" +
            "anyone to know 66\n"
    println(gos)

    //convert var
    var rem_San : String = "anyone to know me"
    rem_San = "no body"
    println(rem_San)

    //escape string
    var Statement: String = "moshi moshi \"konichiwa\""
    println(Statement)
}