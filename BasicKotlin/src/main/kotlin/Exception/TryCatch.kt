package Exception

fun validasiUmur1(umur: Int){

    if(umur<0){
        throw IllegalArgumentException("Umur tidak Valid")
    }

    println("Umur valid $umur")
}

fun main() {
    try {
        validasiUmur1(1)
        validasiUmur1(-1)
    }catch (error: IllegalArgumentException){
        println("Error dengan message: ${error.message}")
    }

}