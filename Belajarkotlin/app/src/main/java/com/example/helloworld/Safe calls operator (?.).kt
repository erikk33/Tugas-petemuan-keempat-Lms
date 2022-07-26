package com.example.helloworld
fun main() {
    val text : String? = null
    text?.length
    val japan : String? = null
    japan?.length

    // elvis operator :)
    val bsaa : String? = null
    val bsaaLength = bsaa?.length ?:7

    val now : String? = null
    val nowLength = now?.length ?:10

   // val host : String? = null
    //val hostLength = host?.length ?:1821

    //val hostLength = if (host != null)
      //  host?.length else 1200

    //non-null assertion (!!)
    val host : String? = null
    val hostLength = host!!.length

    //null operator
   // val namae : String? = null
   //if (namae != null) {
    //  var valnamaeLength = namae.length
    }
