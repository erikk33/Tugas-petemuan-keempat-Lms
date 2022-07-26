package com.example.helloworld

fun main (Args:Array<String>) {
    print("User = ")
    var user_Program = readLine()
    print("Hallo user")
    print(user_Program)
    var ter : String = "HALLO "

    println("Ohayou gozaimasu ,Koniichiwa, konbanwa")
    println("!!!!SYSTEM NOW LOADING")
    var user2 = "$ter Length = ${ter.length}"
    println(user2)

    //input program
    print("Nama kamu = ")
    var namaKamu = readLine()
    print("Status = ")
    var Status = readLine()
    print("Jabatan yang diinginkan = ")
    var jabatanKamu = readLine()

    //output
    var josOutput = """
        >Hallo $user_Program
        >Berikut ini hasil input form mu 
        >System is now loading
        >50 % 
        >100 %
        > nama = $namaKamu
        > Status = $Status
        > Jabatan  = $jabatanKamu
        """.trimMargin(marginPrefix = ">")
    print(josOutput)
}
