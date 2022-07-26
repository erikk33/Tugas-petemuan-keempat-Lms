import kotlin.math.tan

fun main (Args : Array<String>) {
    println("------------------------------------------------------------------------------")
    print("Hello user ^^^^^^^^^^^^^^^^^^______^^^^^")
    println("Silahkan diiisi Biodata berikut ini")
    println("Have A nice day")
    println("Now loading")
    println("10%")
    println("100%")
    println("Completed")

    //input
    print("Nama : ")
    var kimiNamae = readLine()
    print("Tanggal Lahir : ")
    var tanggalLahir = readLine()
    print("Tempat lahir : ")
    var tempatLahir = readLine()
    print("Hobi : ")
    var hobiKamu = readLine()
    print("Alamat : ")
    var alamatKamu = readLine()
    print("Kesukaan : ")
    var kesukaan = readLine()

    //output
    var tesout = """
        ~~~~~~~~System checking data~~~~~~~~~~~~~~~~~
        ~~~~~~~~No Eror~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ~~~~~~~~Procesesing data~~~~~~~~~~~~~~~~~~~~~
        ~~~~~~~~10 %~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ~~~~~~~~50 %---------------------------------
        ~~~~~~~~100 %--------------------------------
        Yourname = $kimiNamae
        Tanggal lahir = $tanggalLahir
        Tempat lahir = $tempatLahir
        Hobi = $hobiKamu
        Alamat = $alamatKamu
        Kesukaan = $kesukaan
        """
    print(tesout)
}