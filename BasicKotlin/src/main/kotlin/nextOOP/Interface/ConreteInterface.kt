package nextOOP.Interface

interface SpaceVehicle{
    fun accelerate()

    fun stop(){
        println("Stop")
    }
}

class LightSpace: SpaceVehicle{
    override fun accelerate() {
        println("BROOOOOOOOOOOOOOOOOM")
    }

    override fun stop() {
        println("CSHHHHHHHHHHHHHHHH")
    }
}

fun main() {
    val roket = LightSpace()

    roket.accelerate()
    roket.stop()
}