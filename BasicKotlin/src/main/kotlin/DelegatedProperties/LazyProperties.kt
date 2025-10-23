package DelegatedProperties

class TranskripNilai {
    val list : List<Char> by lazy{
        println("List di Akses")
        listOf('A', 'B', 'C')
    }
}

fun main() {
    val nilaiMhs = TranskripNilai()
    println(nilaiMhs.list)
    println(nilaiMhs.list)
}