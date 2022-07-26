package com.example.tes2.eyru
fun main () {
    var bertrs: Short = 23
    var bersrtLong: Long = bertrs.toLong()
    println(bertrs)
    val ghois = ((7 + 9000) / 100)
    println(ghois)
val dheid : Float = 2393239023209F
    println(dheid)

    val dersta : Double = 78.1
    println(dersta)
    //overflow mengatahui banyak nilai
       // val maxInt = Int.MAX_VALUE
     //   val minInt = Int.MIN_VALUE

        //println(maxInt)
       // println(minInt)
//Jika kita memasukan nilai melebihi nilai maksimal

    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    }