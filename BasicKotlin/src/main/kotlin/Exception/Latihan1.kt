package Exception

class NilaiTidakValidException(msg: String): Exception(msg)

fun validasiNilai(nilai: Int){
    if(nilai<0 || nilai>100){
        throw NilaiTidakValidException("Nilai Harus di antara 0 hingga 100")
    }
    println("Niai Berhasil diinput, Nilai: $nilai")
}

fun main() {
    try {
        validasiNilai(100)
        validasiNilai(-1)
    }catch (error: NilaiTidakValidException){
        println(error.message)
    }
}