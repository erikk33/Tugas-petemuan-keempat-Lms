fun main (Args: Array<String>) {

    //hello program
    println("---------------------------------------------------------")
    println("Ohayou gozaimasu / Konichiwa / Konbanwa Minassan desu")
    println("----------------------------------------------------------")
    println("Keep work")
    println("-----------------------------------------------------------")

    //input program
    print ("Nama : ")
    var namaSaya = readLine()
    print("Umur : ")
    var umurSaya = readLine()
    print("Jabatan : ")
    var jabatanYangdiinginkan = readLine()
    print ("Hobi: ")
    var hobiSaya = readLine()
    print("alasan memilih jabatan tersebut : ")
    var alasanMemilih = readLine()

    //output program
    var deppato = """
        ~~!!!!!!!!!!_SYSTEM CHECKING~~~~~~~~~~!!!!!
         !!!!!!!!! 10 % !!!!!!!!!!!!!!!!!!!!!!!!!!!
         !!!!!!!!! 20 % !!!!!!!!!!!!!!!!!!!!!!!!!!!
         !!!!!!!!! 30 % !!!!!!!!!!!!!!!!!!!!!!!!!!!
         !!!!!!!!! 40 % !!!!!!!!!!!!!!!!!!!!!!!!!!!
         !!!!!!!!! 50 % !!!!!!!!!!!!!!!!!!!!!!!!!!!
         !!!!!!!!! 100 % !!!!!!!!!!!!!!!!!!!!!!!!!!
         1. name = $namaSaya
         2. umur = $umurSaya
         3. hobi = $hobiSaya
         4. alasan memilih jabatan tersebut = $alasanMemilih
         """
    print(deppato)


}