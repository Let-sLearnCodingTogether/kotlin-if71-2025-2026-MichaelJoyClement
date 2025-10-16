fun main() {
    val angka = listOf<Int>(5, 10, 5)

    val x = angka.map { n->
        n*2
    }

    val y = angka.map{
        it*2
    }

    println(x)
    println(y)

}