fun main() {
// Penggunaan print angka binary (literral)
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xff
    var binaryLiteral: Int = 0b0001
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    // Pemisah angka _
    var age: Long = 189_900093939939_1299L
    println(age)

    var ageInt: Int = age.toInt()
    println(ageInt)
}