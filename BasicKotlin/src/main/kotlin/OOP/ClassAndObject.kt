class MahasiswaConstructor(
    val npm: String,
    val nama: String,
    var ipk: Float
)

fun main(){
    val mahasiswaPertama = MahasiswaConstructor(
        npm = "2226250041",
        nama = "mahasiswa 1",
        ipk = 1.3f
    )

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 2.0f
    println(mahasiswaPertama.ipk)
}