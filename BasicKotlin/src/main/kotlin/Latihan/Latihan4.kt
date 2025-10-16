package Latihan

fun main() {
    var numberOfDays = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")
    println("==========================================")
    println("Jumlah Hari : ${numberOfDays.size}")
    println("Hari Pertama: ${numberOfDays.first()}")
    println("Hari Terakhir: ${numberOfDays.last()}")

    numberOfDays.set(5-1, "Jum'at Barokah" )
    println(numberOfDays.get(5-1))
    println("==========================================")

}