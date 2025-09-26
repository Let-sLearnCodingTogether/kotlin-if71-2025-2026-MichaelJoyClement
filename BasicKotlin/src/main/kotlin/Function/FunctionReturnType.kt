fun sum(firstNumber: Int, secondNumber: Int): Int{
    return firstNumber+secondNumber
}

fun main() {
    //Tidak ada hasil karena di return, jadi harus di print di main
    sum(12,20)
    //Akan muncul karena menggunakan sintaks println untuk print
    println(sum(12,20))
}