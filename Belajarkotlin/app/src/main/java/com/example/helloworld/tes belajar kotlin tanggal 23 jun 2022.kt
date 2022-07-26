package com.example.helloworld
fun main (Args:Array<String>) {
    // Program input data jasa instalasi os
    print("HELLO USER = ")
    var userK = readLine()
    println(userK)
    println("NICE TO MEET YOU :~)")
    println("Please input you data on buttom field")

    // Output
    print("Namae = ")
    var namaE = readLine()
    print("Kurasu = ")
    var kuraSu = readLine()
    print("Asal = ")
    var asalKamu = readLine()
    print("Os yang akan diinstalkan = ")
    var osInstall = readLine()
    print("Jenis program instalasi os = ")
    var jenisInstalasi = readLine()

    //output
    var erxc = """
        ohayou gozaimasu, Konnichiwa, Konbanwa user = $userK
        11111!!!!!!!!!!!!! Please waited program run sucessfull
        1111111111111111111111111111111111111111111111111111111
        Nama kamu = $namaE
        kelas kamu = $kuraSu
        asal kamu = $asalKamu
        Os yang ingin diinstalkan = $osInstall
        Jenis program jasa instalasi yang dipilih = $jenisInstalasi
        Thanks for choose my help instalation OS 
        ^_^)))))))))))))))))))))))))))))))))))))))))))))))
        """
    print(erxc)
}