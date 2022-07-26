package com.example.latihanfunctionmalamjul62022

import androidx.navigation.NavArgs

fun main (args: Array<String>) {
    //halo User

    println("Kimi no id ? =  ")
    var id = readLine()
    println(
        """
            >Ohayou gozaimasu,Konnichiwa, Konbanwa your id is $id
            >System is now loading data 
            >Please Wait now $id
            >System has been completed
            >Happy use
            """.trimMargin(">")
    )

    //input data
    println("Namae wa : ")
    var Namaewa = readLine()
    println("Kimi no age : ")
    var Age = readLine()
    println("Jurusan asal : ")
    var Jurusan = readLine()


    //Output data
    var outpuend = """
        .>kochirakoso $Namaewa pleae wait your data until done progress
        .>Now loading 10%
        .>Now Loading 20%
        .>Now Loading 30%
        .>Now loading 50%
        .>Now Loading 80%
        .>Done
        1. name = $Namaewa
        2. Age = $Age
        3. Jurusan = $Jurusan
    """.trimIndent()

}