fun main() {
    val daftarJudulBuku: List<String> = listOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi"
    )

    val koleksiGenre: MutableList<String> = mutableListOf()

    koleksiGenre.add("Novel")
    koleksiGenre.add("Filsafat")
    koleksiGenre.add("Sejarah")

    val inventarisBuku: MutableMap<String, String> = mutableMapOf(
         "978-602-03-8591-6" to "Laskar Pelangi",
         "978-979-3062-79-2" to "Bumi Manusia",
         "978-602-06-3534-7" to "Filosifi Teras",
         "978-602-03-8591-6" to "Laskar Pelangi",
    )

    println("-- 1. Inisialisasi Data --")
    println("List Judul Buku: ${daftarJudulBuku.joinToString()}")
    println("List Koleksi Genre: ${koleksiGenre.joinToString()}")
    println("Map Inventaris Buku: ${inventarisBuku.keys}")
    println()
    println("-- 2. Manipulasi dan Analisis Data --")
    println("Judul Buku dengan ISBN: 978-979-3062-79-2 adalah: ${inventarisBuku.get("978-979-3062-79-2")}")
    inventarisBuku.putAll(mapOf("978-623-91289-8-2" to "Atomic Habits"))
    println("Buku baru 'Atomic Habits' berhasil ditambahkan")
    println("Isi Inventaris sekarang: $inventarisBuku")
    println("Jumlah Genre yang ada di toko: ${koleksiGenre.count()}")
    println()
    val judulIterator = daftarJudulBuku.iterator()
    println("Daftar Semua judul buku yang tercatat: ")
    while (judulIterator.hasNext()) {
        println("- ${judulIterator.next()}")
    }
    println("-------------------------------")

}