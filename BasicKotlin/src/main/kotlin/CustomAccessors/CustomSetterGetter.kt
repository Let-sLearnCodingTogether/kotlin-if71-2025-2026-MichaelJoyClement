class nilaiUjian(nilaiUts: Double){
    var nilaiUts: Double = nilaiUts
        get() = field * 0.1 //backing field
        set(value){
            field = if(value < 0) 0.0 else value
        }

    val nilaiAkhir: Double
        get() = nilaiUts * 2
}

fun main() {
    val nilaiMhs1 = nilaiUjian(80.3)
    println(nilaiMhs1.nilaiUts)
    println(nilaiMhs1.nilaiAkhir)

    nilaiMhs1.nilaiUts = -20.00
    println(nilaiMhs1.nilaiUts)

    nilaiMhs1.nilaiUts = 80.00
    println(nilaiMhs1.nilaiUts)
}