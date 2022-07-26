package com.example.helloworld


fun main () {
    var osi : String = "Watashi no namae wa erik desu"

    var biodata : String = """
        ~Watashi no namae wa erik desu
        ~Fresh graduate sman 1 kuta xii ips 2
        ~Alamat rumah perumahan graha parta lestari Bloj j no 4
        ~Douzo yoroshiku
   
        
        """.trimMargin("~")

    var bio : String = "$biodata Length = ${biodata.length}"

    println(osi)
    println(biodata)
    println(bio)
}