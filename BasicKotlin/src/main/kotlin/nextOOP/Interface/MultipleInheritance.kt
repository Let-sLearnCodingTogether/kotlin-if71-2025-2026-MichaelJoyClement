package nextOOP.Interface

interface wheeled{
    val numberOfWheel: Int
}

interface vehicle{
    val vehicleType: String
}

class Plane: wheeled, vehicle{
    override val vehicleType: String = "Pesawat Terbang"
    override val numberOfWheel: Int = 3
}

fun main(){
    val pesawat = Plane()

    println("${pesawat.vehicleType} memiliki ${pesawat.numberOfWheel} roda")
}

