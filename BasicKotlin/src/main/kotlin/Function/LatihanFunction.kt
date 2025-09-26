fun hitungPanjangNama(name:String?):Int{
    return name?.length ?: 0
}

fun main() {
    println(hitungPanjangNama(null))
}