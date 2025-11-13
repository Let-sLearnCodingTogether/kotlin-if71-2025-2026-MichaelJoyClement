package nextOOP.Interface

interface VehicleProperties{
    val weight: Int
    val name: String
        get() = "Vehicle"

}

class Mobil(): VehicleProperties{
    override val weight: Int = 1000
}

fun main() {
    val mobil = Mobil()

    println(mobil.weight)
    println(mobil.name)
}

