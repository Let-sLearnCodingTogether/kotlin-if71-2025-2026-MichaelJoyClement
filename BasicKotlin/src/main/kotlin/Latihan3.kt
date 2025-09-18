fun main() {
    var totalBelanja = 0.0
    var jumlahItem = 3.0
    val price = 25000.0
    println("Status Awal -> Total Belanja : $totalBelanja")

    totalBelanja = jumlahItem*price
    println("Setelah Item A -> Total Belanja : $totalBelanja")

    var jumlahItem2 =2
    var price2 = 15000
    totalBelanja = totalBelanja+(price2*jumlahItem2)
    println("Setelah Item B -> Total Belanja : $totalBelanja")

    var diskon = 10000
    totalBelanja -= diskon
    println("Setelah Diskon -> Total Belanja : $totalBelanja")

    val ppn = totalBelanja / 100
    println("Ditambah Biaya Layanan (Rp $ppn) -> Total Belanja : "+(totalBelanja+ppn))


    println("========================================================")
    println("Total Akhir yang Harus Dibayar: Rp"+(totalBelanja+ppn))
    println("========================================================")
}