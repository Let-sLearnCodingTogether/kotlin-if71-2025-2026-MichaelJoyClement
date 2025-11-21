package Exception

fun validasiUmur(umur: Int){
    if(umur<0){
        throw IllegalArgumentException("Umur tidak Valid")
    }

    println("Umur valid $umur")
}

fun main() {
    validasiUmur(1)
    validasiUmur(-1)
}