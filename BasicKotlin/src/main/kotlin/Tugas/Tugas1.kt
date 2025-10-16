const val KAPASITAS_TAS = 20.0
const val NAMA_PETUALANG = "Michael Joy Clement"

fun responses(totalBeratBawaan: Double): Boolean{
    var sisaKapasitas = KAPASITAS_TAS-totalBeratBawaan
    return if(totalBeratBawaan>KAPASITAS_TAS){
        println("Bahaya, Kelebihan Muatan! Berat saat ini: $totalBeratBawaan kg. Kapasitas hanya $KAPASITAS_TAS kg")
        true
    }
    else if(totalBeratBawaan == KAPASITAS_TAS){
        println("Optimal, Tas Milik $NAMA_PETUALANG Sekarang Penuh dengan Sempurna")
        true
    }
    else{
        println("Barang Berhasil dimasukkan. Sisa kapasitas tas: $sisaKapasitas")
        false
    }
}


//fun response(totalBeratBawaan:Double){
//    var sisaKapasitas = KAPASITAS_TAS-totalBeratBawaan
//    false
//    if(totalBeratBawaan>KAPASITAS_TAS){
//        println("Bahaya, Kelebihan Muatan! Berat saat ini: $totalBeratBawaan kg. Kapasitas hanya $KAPASITAS_TAS kg")
//        true
//    }
//    else if(totalBeratBawaan == KAPASITAS_TAS){
//        println("Optimal, Tas Milik $NAMA_PETUALANG Sekarang Penuh dengan Sempurna")
//        true
//    }
//    else{
//        println("Barang Berhasil dimasukkan. Sisa kapasitas tas: $sisaKapasitas")
//        false
//    }
//}

fun main() {
    var totalBeratBawaan = 0.0
    var savedItem: MutableList<String> = mutableListOf()
    var savedWeight: MutableList<Double> = mutableListOf()


    for (index in  1 .. 3){
        println("---Memasukkan Barang #$index")
        println("Masukkan Nama Barang: ")
        var item = readln()
        println("Masukkan Berat Untuk '$item' (kg): ")
        var itemWeight = readln().toDoubleOrNull() ?: 0.0
        println("'$item' dengan berat $itemWeight kg telah ditambahkan")
        totalBeratBawaan += itemWeight
//        println("Barang berhasil dimasukkan. Sisa Kapasitas tas: ${KAPASITAS_TAS-totalBeratBawaan}")
        savedItem.add(item)
        savedWeight.add(itemWeight)

        responses(totalBeratBawaan)
        val isStopped = responses(totalBeratBawaan)
        if(responses(totalBeratBawaan) == true){
            break
        }

        println()
    }
}