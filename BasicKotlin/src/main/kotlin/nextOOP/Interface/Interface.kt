package nextOOP.Interface

interface Kendaraan{
    fun accelerate()
    fun stop()
}

class Motor: Kendaraan{
    override fun accelerate() {
        println("NGENGGGGGG")
    }

    override fun stop() {
        println("CITTTTTTTTTTTTTTTTT Duarrr")
    }

}

fun main() {
    val motor = Motor()

    motor.accelerate()
    motor.stop()
}