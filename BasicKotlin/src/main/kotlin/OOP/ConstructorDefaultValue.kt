package OOP

class MahasiswaConstructorDefaultValue(
    val npm: String,
    val nama: String,
    var ipk: Float
){
    init {
    println("Ini blok init")
    }
}

class ClassAndObjectConstructorDefaultValue {

}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        npm= "2226250041",
        nama="Michael Joy Clement",
        ipk= 3.75f
    )
    println(mahasiswaPertama.ipk)



}