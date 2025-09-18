fun main() {
    var totalBelanja = 0.0
    var jumlahItem1 = 3.0
    val price1 = 25000.0
    var jumlahItem2 =2.0
    var price2 = 15000.0
    var diskon = 10000

    println("Status Awal -> Total Belanja : $totalBelanja")
    totalBelanja = jumlahItem1*price1
    println("Setelah Item A -> Total Belanja : $totalBelanja")
    totalBelanja += (price2*jumlahItem2)
    println("Setelah Item B -> Total Belanja : $totalBelanja")
    totalBelanja -= diskon
    println("Setelah Diskon -> Total Belanja : $totalBelanja")

    val ppn = totalBelanja / 100
    println("Ditambah Biaya Layanan (Rp $ppn) -> Total Belanja : "+(totalBelanja+ppn))


    println("========================================================")
    println("Total Akhir yang Harus Dibayar: Rp"+(totalBelanja+ppn))
    println("========================================================")
}