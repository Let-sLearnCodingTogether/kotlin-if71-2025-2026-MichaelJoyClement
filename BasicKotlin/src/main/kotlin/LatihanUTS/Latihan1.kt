package LatihanUTS


fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55
    )

    //Using min
    println(stokBarang.keys.min())
    println(stokBarang.values.min())

    //Using minByOrNull
    val barangTersedikit = stokBarang.minByOrNull { it.value }
    println(
    barangTersedikit?.let { "${it.key}(${it.value})"}?: "Tidak Ada Stok"
    )

    println("${barangTersedikit?.key} (${barangTersedikit?.value})")
}