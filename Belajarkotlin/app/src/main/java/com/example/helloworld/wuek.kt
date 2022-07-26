package com.example.helloworld
fun main (Args:Array<String>) {
    println("USER ID  =")
    var UsR = readLine()
    println("Ohayou gozaimasu , Konnichiwa , Konbanwa User")
    var ab= readLine()
    var ase : String = "$UsR $ab"
    var asec : String = "$ab length = ${ase.length}"
    println(asec)
    println(ase)
    println("SYSTEM IS NOW LOADING")
    println("PROGGRRES YOUR DATA _______")

    //INPUT
    print("namae = ")
    var namaE = readLine()
    print("Kurasu  = ")
    var kurASU = readLine()
    print("JABATAN YANG DIINGINKAN = ")
    var jabaTan = readLine()
    print("ALASAN INGIN BERGABUNG DI JABATAN TERSEBUT = ")
    var Ajaba = readLine()

    //output
    var asHH = """
        > 1.System is now loading 
        > 2. Processing data NOW
        > 3. Will be take a minute longger
        > 4. PLease wait
        > Nama = $namaE
        > kelas = $kurASU
        > jabatan = $jabaTan
        > alasan memilih jabatan tersebut = $Ajaba
        
        """.trimMargin(">")
    println(asHH)

}