import kotlin.jvm.internal.Intrinsics

fun main (Args: Array<Intrinsics.Kotlin>) {
    println("Hello user peserta pelamar kerja")
    println("---------------------------------------------------------------")
    println("Now loading")
    println("-------------------------")

    //input data
    print("hai user : ")
    var userYou = readLine()
    print("Nama : ")
    var namaYou = readLine()
    print("tanggal lahir : ")
    var tanggalLahir = readLine()
    print("tempat lahir : ")
    var tempatLahir = readLine()

    //output
    var bestie = """
        11-1-1-1--1-1-
        1. nama = $namaYou
        2. tanggal lahir = $tanggalLahir
        tempat lahir = $tempatLahir
        """
    print(bestie)

}

