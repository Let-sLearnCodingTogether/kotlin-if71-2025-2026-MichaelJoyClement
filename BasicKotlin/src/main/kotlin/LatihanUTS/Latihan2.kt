package LatihanUTS

class Karyawan(val nama: String, val id: String, val gajiPokok: Double){
    fun tampilaknProfil(){
        println("Nama Karyawan\t: $nama")
        println("ID Karyawan\t\t: $id")
    }
    fun hitungGajiBulanan(jumlahHariMasuk : Int): Double {
        return (jumlahHariMasuk.toDouble()/22)*gajiPokok
    }
}

fun main() {
    val karyawanA = Karyawan("Adrian", "K001", 10_000_000.00)
    val karyawanB = Karyawan("Joy", "K002", 2_000_000.00)

    karyawanA.tampilaknProfil()
    println("Gaji Bulanan Karyawan A: ${karyawanA.hitungGajiBulanan(11)}")
    println()
    karyawanB.tampilaknProfil()
    println("Gaji Bulanan Karyawan B: ${karyawanB.hitungGajiBulanan(22)}")



}