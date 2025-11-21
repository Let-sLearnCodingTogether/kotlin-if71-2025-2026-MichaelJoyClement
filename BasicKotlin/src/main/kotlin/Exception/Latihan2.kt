package Exception

data class Barang (val nama:String, val stok:Int)

class StokHabisException(msg: String): Exception(msg)

fun beliBarang(barang: Barang, jumlahBeli: Int){
    if(jumlahBeli>barang.stok){
        throw StokHabisException("Gagal beli ${barang.nama}. Stok hanya sisa ${barang.stok}")
    }else{
        println("Berhasil membeli $jumlahBeli ${barang.nama}")
    }

}

fun main() {
    val barang1 = Barang("Panci", 1000)
    try {
        beliBarang(barang1, 500)
        beliBarang(barang1, 1500)
    }catch (error: StokHabisException){
        println(error.message)
    }
}