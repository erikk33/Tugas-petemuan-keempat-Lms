package com.example.helloworld

fun main () {
var data_Benar : Boolean = true;
    var data_Salah : Boolean = false;

    println(data_Benar)
    println(data_Salah)

    var sbmptn : String = "Ganbare erik kun kamu sudah berjuang masih ada jalur backend"
    var nilai_sbmptn : String = "-"
    var kemungkinan_nilaiSbmptn : String = "Prediksi nilai sbmptn mu adalah = "
    var total : String = nilai_sbmptn + "" + sbmptn
    var totalv2 : String = "$sbmptn  $nilai_sbmptn"
    var yui : String = "$totalv2 length = ${totalv2.length}"

    var Kemungkinan_nilai_sbmptn = """
        638.389
       589,900
       678,839
       """

    var alamat_peserta_utbk = """
        ~Jalan gunung mas
        ~perumahan graha parta lestari Blok j No 4
        ~Padang sambian kelod denpasar barat - Bali
        """.trimMargin("~")

    println(sbmptn)
    println(nilai_sbmptn)
    println(kemungkinan_nilaiSbmptn)
    println(Kemungkinan_nilai_sbmptn)
    println(alamat_peserta_utbk)
    println(total)
    println(totalv2)
    println(yui)

}