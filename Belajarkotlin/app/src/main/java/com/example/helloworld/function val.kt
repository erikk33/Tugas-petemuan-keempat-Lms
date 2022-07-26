package com.example.helloworld

fun main (Args : Array<String>) {
    println("System is now loading")
    println("----------------------------------------------------------------------")
    println("Bulid form to you -_-!!!!!!!")
    println("Loading completed")

    //input
    print("Namae : ")
    var namaKamu = readLine()

    print("Kelasto : ")
    var kelasTo = readLine()

    print("jabatan Yang kamu pilih : ")
    var jabatan_Yang_kamu_pilih = readLine()

    print("silahkan input cv mu : ")
    var text_Cv = readLine()

    //output
    var outd = """
        1112812 Now processing data 112139123
        1251261 Loading 10 %        121291282
        1212912 Loading 20 %        129129282
        2382932 Loading 50 %        291921292
        2129192 Loading 90 %        292939232
        1281212 Loading 100 %       232392393
        1. NAMA = $namaKamu
        2. KELAS =$kelasTo
        3. JABATAN = $jabatan_Yang_kamu_pilih
        4. CV = $text_Cv
        """
    print(outd)


    val erik_kun = "Erik_kun"
    println(erik_kun)

    var Programmer: Long = 12913829319381L
    println(Programmer)

    var programmerShort: Short = Programmer.toShort()
    println(programmerShort)
}