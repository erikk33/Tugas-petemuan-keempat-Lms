package com.example.tersdsnxcsuj
//CONJUCTION atau AND &&
fun main () {
    val officeOpen = 9
    val officeClosed = 19
    val now = 22

    val isOpen = if (officeClosed >= officeOpen && officeClosed <= now) {
        true
    } else {
        false
    }
    println(isOpen)


// Disjunction and or ||
    val bers = 18
    val dhsse = 20
    val bosy = 39
    val isnowClosed = bosy > dhsse || bosy < bers
    println("is now closed : $isnowClosed")

    // negation not
    val osee = 19
    val gosy = 10
    val shoe = gosy > osee
    if (!shoe) {
        print("office is closed")
    } else {
        print("office is open")
    }

}

