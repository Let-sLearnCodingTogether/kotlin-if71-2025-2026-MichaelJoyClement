package OOP

data class Kendaraan(val merek: String, val tahun: Int) {
}

fun main() {
    val tayo = Kendaraan("Tayo", 2015)
    val (merk, tahun) = tayo

    print(merk)
}