package Generic

fun main() {
    val daftarHarga: Map<String, Int> = mapOf(
        "Apel" to 5000,
        "Jeruk" to 7000,
        "Mangga" to 12000
    )

    for ((k,v) in daftarHarga){
        println("$k Harganya Rp $v")
    }
}