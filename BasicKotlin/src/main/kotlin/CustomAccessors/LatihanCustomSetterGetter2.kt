package CustomAccessors

class Mahasiswa(ipk: Double){
    var ipk: Double = ipk
        set(value){
            field = if(value < 0.0) 0.0 else if(value > 4.0) 4.0 else value
        }
}

fun main() {
    var ipk1 = Mahasiswa(0.0)

    ipk1.ipk = 4.5
    println(ipk1.ipk)
}