package com.example.helloworld

//program input data by erik xzc
fun main (Args:Array<String>) {
    print("YOU USER ID = ")
    var userId = readLine()
    println(userId)
    var set2 : String = "Ohayou gozaimasu, Konnichiwa Konbanwa"
    var setend : String = "$userId $set2"
    var setendfg : String = "$setend Length = ${setend.length}"
    println(setendfg)
    println(setend)
    println("System is now loading to create FORM ---------------------------------- ")
    println("LOADING HAS COMPLETED")

    //input program created by erik kun
    print("Namae = ")
    var namaE = readLine()
    print("Kurasu = ")
    var kuraSu = readLine()
    print("Jabatan yang dipilih = ")
    var jabatanYg = readLine()
    print("alasan bergabung ke jabatan tersebut = ")
    var alasanJ = readLine()

    //OUTPUT
    var outErxc = """
        >Ohayou gozaimasu konbanwa konnichiwa $userId
        >System is now loading ________________________
        >LOADING HAS BEEN COMPLETED
        >YOUR RESULT FROM INPUT THIS FORM 
        > nama  = $namaE
        > kelas = $kuraSu
        > Jabatan = $jabatanYg
        > Alasan = $alasanJ
        """.trimMargin(marginPrefix = ">")
    println(outErxc)
}