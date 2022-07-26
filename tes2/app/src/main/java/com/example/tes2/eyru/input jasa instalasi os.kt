package com.example.tes2.eyru
fun main (Args:Array<String>) {
//program input costumer jasa instalasi os
     println("kimi no namae wa = ")
    var kimiNo = readLine()
    println("""
        >ohayou gozaimasu 
         
         >konichiwa
          
          >konbanwa
            
            >$kimiNo
            """.trimMargin(">")
    )
println("now loading please waited")

    //input data
    print("kimi no namae wa : ")
    val namaE = readLine()
    println("kimi your age : ")
    val ageK = readLine()
    print("school : ")
    val schooL = readLine()

    //output data

    val restrs = """
        <. Data is prosessing now
        <. Now loading ---------------------
        <. RAm used 1.0gb 
        <.Almost done--------------------------
        
        <. namae = kimi no namae wa $namaE
        <. Age = kimi no age wa $ageK
        <. School = Kimi no school $schooL
        
        """.trimMargin("<.")
    println(restrs)

}