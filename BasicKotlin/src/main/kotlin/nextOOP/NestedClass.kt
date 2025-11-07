package nextOOP

class Gedung(val nama: String){
    private val alamat: String = "Jl. Sudirman"

    inner class RuangRapat(){
        fun mulaiRapat(){
            println("Rapat dimulai")
            println("Rapat dimulai di gedung $nama di alamat $alamat")
        }
    }

}

fun main() {
    val gedungDPR = Gedung("DPR")
    val ruangRapat = gedungDPR.RuangRapat()
    ruangRapat.mulaiRapat()
}