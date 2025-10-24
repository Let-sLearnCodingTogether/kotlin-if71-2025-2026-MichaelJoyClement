class PersegiPanjang (val panjang: Double, val lebar: Double){
    val luas: Double
        get() = panjang * lebar
}

fun main() {
    val persegiPanjang1 = PersegiPanjang(20.0,10.0)
    println("Luas Persegi Panjang 1: ${persegiPanjang1.luas}")
}