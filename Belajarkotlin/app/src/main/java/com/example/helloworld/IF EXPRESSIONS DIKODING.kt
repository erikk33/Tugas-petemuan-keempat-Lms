package com.example.helloworld
fun main () {
    val oishi = 20
    val gosht_strinke = 12
    val noue: String

    noue = if (oishi > gosht_strinke) {
        "office already open"
    } else if (oishi == gosht_strinke) {
        "wait a minute to be open"
    } else {
        "please can be with"
    }
    print(noue)
}