package com.example.helloworld.latihan

fun main () {
    val tersdff = "30"
    val gosty = "12"
    var ostu : String

    ostu = if (tersdff > gosty) {
        "iam open to persons here"
    } else if (gosty == tersdff) {
        "close"
    } else {
        "already to closed"
    }
    println(ostu)
}
