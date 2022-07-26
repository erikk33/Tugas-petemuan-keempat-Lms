package com.example.latihanfunc100work
//conjuction
fun main () {
    val joe = 122
    val kore = 18
    val giese = 2128
    val goose = if (kore <= joe && kore >= giese) {
        println("If you come back try it")
    } else {
        println("not come")
    }
    println(goose)

    //disjuction
    val hus = 1289
    val goserr = 100
    val geos = 2911
    val gosersz = hus > goserr || hus < geos
        println("you now alowed come this track")

    //nor
    val husin = 2382
    val hosu = 2392
    val hoes1 = hosu > husin
    val ewws = if (!hoes1) {
        println("please ask casir to permissions")
    } else {
        println("not bad your koding skill")
    }
}