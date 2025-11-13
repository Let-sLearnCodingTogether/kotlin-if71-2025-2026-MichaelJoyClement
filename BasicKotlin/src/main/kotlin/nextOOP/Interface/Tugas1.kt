package nextOOP.Interface

interface Electronics{
    val brand: String
    fun turnOn()
    fun turnOff()
    fun cleanDrive(){
        println("Membersihkan debu dari perangkat $brand")
    }
}

class SmartLight(override val brand: String): Electronics{
    override fun turnOn() {
        println("Lampu $brand Mati")
    }
    override fun turnOff() {
        println("Lampu $brand Hidup")
    }
}

class Fan(override val brand: String): Electronics{

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }
}

fun main() {
    val kipas = Fan("Panasonic")

    kipas.turnOn()
    kipas.turnOff()
    kipas.cleanDrive()

    println("=================================================")

    val lampu = SmartLight("Phillip")

    lampu.turnOn()
    lampu.turnOff()
}