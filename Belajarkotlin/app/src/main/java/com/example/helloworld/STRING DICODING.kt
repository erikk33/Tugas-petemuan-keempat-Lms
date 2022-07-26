package com.example.helloworld

fun main () {
    val textString = "kotlin"

    //indexing cara mencari karakter paling depan dalam sebuah string
    val text = "Kotlin"
    val firstChar = text[0]
    println("first character of $text is $firstChar ")

    //for loop
    val text1 = "Kotlin"
    for (char in text1) {
        print("$char")

        //escape string
        val statement = "kotlin is \"Awesome!\""
        println(statement)

        //unicode string
        fun main() {
            val name = "Unicode test: \u00A9"
            print(name)
        }

        //raw string
        val line = "Line 1\n" +
                "Line 2\n" +
                "Line 3\n" +
                "Line 4\n"
    }

}
