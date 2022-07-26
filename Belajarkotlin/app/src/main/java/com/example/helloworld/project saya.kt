fun main (args: Array<String>) {

    //teks hello
    println("------------------------------")
    println("-------------------------------")
    println("Konnichiwa silahkan isi data pribadi anda")
    println("Silahkan di input dengan benar !")
    println("------------------------")

    // mengambil input dan mengisinya ke variabel
    print("nama lengkap : ")
    var namaLengkap = readLine()
    print("jenis kelamin : ")
    var jenisKelamin = readLine()
    print("Hobi :")
    var hobi = readLine()

    //code output
    var templateBio = """
        +-------------------------------+
        1 BIO DATA PROGRAMER dan UI UX
        +---------------------------------+
        1 Nama lengkap: $namaLengkap
        2 Jenis kelamin: $jenisKelamin
        3 Hobi : $hobi
        """
    println(templateBio)
 }