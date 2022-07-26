fun main (Args : Array<String>) {
    println("-------------------------------------------------------------------")
    println("hallo selamat datang di program input biodata wawancara kerja")
    println("----------------------------------------------------------------------")
    println("-----------------------------------------------------------------------")

    //input data
    print("Nama : ")
    var namaKamu = readLine()
    print("kelas : ")
    var kelasKam= readLine()

    //output data
    var terysd = """
        11111 data kamu adalah
        1. Nama = $namaKamu
        2. kelas = $kelasKam
        """
    println(terysd)
}