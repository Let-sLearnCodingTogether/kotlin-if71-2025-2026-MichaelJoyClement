fun processArrayGeneric(){
    val jumlahData = 1_000_000

    val dataSensor = Array(size = jumlahData){
        it+1
    }

    val waktuMulai = System.nanoTime()

    var total : Long = 0
    for(data in dataSensor){
        total += data
    }

    val ratata = total.toDouble()
    var waktuSelesai = System.nanoTime()
    var durasiMs = (waktuSelesai-waktuMulai)/1000_000.0

    println("Generic")
    println("Jumlah Data: $jumlahData")
    println("Waktu: $durasiMs")
}

fun processArrayPrimitive(){
    val jumlahData = 1_000_000

    val dataSensor = IntArray(size = jumlahData){
        it+1
    }

    val waktuMulai = System.nanoTime()

    var total : Long = 0
    for(data in dataSensor){
        total += data
    }

    val ratata = total.toDouble()
    var waktuSelesai = System.nanoTime()
    var durasiMs = (waktuSelesai-waktuMulai)/1000_000.0
    println("Primitive")
    println("Jumlah Data: $jumlahData")
    println("Waktu: $durasiMs")
}

fun compare(){
    processArrayPrimitive()
    processArrayGeneric()
}

fun main() {
    compare()
}