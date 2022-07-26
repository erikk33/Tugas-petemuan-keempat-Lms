fun main (args : Array<String>) {
    println("-------------------------------------------")
    println("Konnbanwa minasan silahkan input biodata ini")
    println("----------------")
    println("Ganbate ne")

    //input data
    print("Namae : ")
    var  NamaLengkap = readLine()
    print("Hobi : ")
    var hobiKamu = readLine()
    print("kelas : ")
    var kelasKamu = readLine()


    //code output
    var templateBio = """
        1 BIO DATA KAMU 
        -_-_-+_--------------------__!)@
        2 Result 
        
        _______THANKS FOR INPUT ---------------------------P
        3 namaLengkap = $NamaLengkap
        4 Hobi = $hobiKamu
        5 Kelas = $kelasKamu
        
        """
    println(templateBio)



}