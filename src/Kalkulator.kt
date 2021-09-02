fun main() {
    println("1. Penjumlahan\n" +
            "2. Pengurangan\n" +
            "3. Perkalian\n" +
            "4. Pembagian")

    print("Pilihan (1/2/3/4) : ")
    val input = readLine()

    if (input?.toInt() == 1) {
        println("Penjumlahan")
        plus()
    } else if (input?.toInt() == 2) {
        println("Pengurangan")
        minus()
    } else if (input?.toInt() == 3) {
        println("Perkalian")
        times()
    } else if (input?.toInt() == 4) {
        println("Pembagian")
        div()
    } else {
        println("Input tidak sesuai pilihan")
    }
}

fun plus() {
    print("angka pertama : ")
    val number1 = readLine()
    print("angka kedua : ")
    val number2 = readLine()
    if (!number1.isNullOrEmpty() && !number2.isNullOrEmpty()) {
        val result = number1.toInt() + number2.toInt()
        println("Hasil : $result")
    }
}

fun minus() {
    print("angka pertama : ")
    val number1 = readLine()
    print("angka kedua : ")
    val number2 = readLine()
    if (!number1.isNullOrEmpty() && !number2.isNullOrEmpty()) {
        val result = number1.toInt() - number2.toInt()
        println("Hasil : $result")
    }
}

fun times() {
    print("angka pertama : ")
    val number1 = readLine()
    print("angka kedua : ")
    val number2 = readLine()
    if (!number1.isNullOrEmpty() && !number2.isNullOrEmpty()) {
        val result = number1.toInt() * number2.toInt()
        println("Hasil : $result")
    }
}

fun div() {
    print("angka pertama : ")
    val number1 = readLine()
    print("angka kedua : ")
    val number2 = readLine()
    if (!number1.isNullOrEmpty() && !number2.isNullOrEmpty()) {
        val result = number1.toInt() / number2.toInt()
        println("Hasil : $result")
    }
}
