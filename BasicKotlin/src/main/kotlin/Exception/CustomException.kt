package Exception

class SaldoKurangException(msg : String): Exception(msg)

val saldo: Int = 100_000
fun tarikTunai(jumlah: Int){
    if(jumlah>saldo){
        throw SaldoKurangException("Sadar Diri")
    }
    println("Penarikan Berhasil")
}

fun main() {
    tarikTunai(200_000)
}