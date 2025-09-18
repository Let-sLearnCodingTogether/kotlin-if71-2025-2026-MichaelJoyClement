fun main() {
    val nilaiA = 20
    val nilaiB = 10
    var value = 0

    if (nilaiA > nilaiB){
        value = nilaiA+nilaiB
    }
    else{
        value = nilaiA
    }
    println(value)


    val apakahLebihBesar = nilaiA > nilaiB
    println(apakahLebihBesar)

    val apakahSama = nilaiA == nilaiB
    println(apakahSama)

    val apakahTidakSama = nilaiA != nilaiB
    println(apakahTidakSama)

    println("apel"<"Kacang")
    println("apel"=="apel")
}