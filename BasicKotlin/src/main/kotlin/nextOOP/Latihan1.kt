package nextOOP

open class Pegawai(val nama: String, val gajiDasar: Double){
    open fun hitungGaji(): Double{
        return gajiDasar
    }
}

class Manager(nama: String, gajiDasar: Double): Pegawai(nama, gajiDasar){
    override fun hitungGaji(): Double {
        return gajiDasar
    }
}

class Programmer(nama: String, gajiDasar: Double): Pegawai(nama, gajiDasar){
    override fun hitungGaji(): Double {
        return gajiDasar*0.1
    }
}

fun main() {
//    val manager1 = Manager("Joy", 1_000_000.0).hitungGaji()
//    val programmer1 = Programmer("Programmer", 1_000_000.0).hitungGaji()
//    println(programmer1)
//    println(manager1)

    val pegawai:MutableList<Pegawai>  = mutableListOf(
        Programmer("Adrian",1_000_000.0),
        Manager("Joy", 1_000_000.0)
    )

    pegawai.forEach { println("${it.nama} dengan gaji ${it.hitungGaji()}")}


}

