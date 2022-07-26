import java.util.jar.Attributes

fun main (Args : Array<String>) {
    println("Silahkan diisi datanya dengan benar ya")

    // input
    print ("Nama : ")
    var namaAnda = readLine()
    print ("Age : ")
    var yourAge = readLine()
    print ("Jabatan yang anda inginkan : ")
    var jabatanKamu = readLine()


    //output
    var terusIsi = """
        %ATENTION LOADING%
        % 10 %
        % 20 %
        % 30 %
        % 40 %
        % 50 %
        % 60 %
        % 70 %
        % 80 %
        % 90 %
        % 100 %
        %ARIGATOU GOZAIMASU SUDAH MENGINPUT DATA DENGAN BENAR %
        ________-DATA KAMU ADALAH-______________________________
        namaKamu = $namaAnda
        yourAge = $yourAge
        jabatan = $jabatanKamu
        """
    println(terusIsi)
}