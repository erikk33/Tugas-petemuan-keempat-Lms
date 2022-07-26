package com.example.helloworld.latihan

fun main () {

    //elvis null
    val speaker_acome : String? = null
    val speaker_acomeLength = speaker_acome?.length ?:32932
    //no point excpetion nulll
    val asejer : String? = null
    val asejerLength = asejer!!.length
}