package nextOOP

enum class DayOfTheWeek{
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val dayOfTheWeek = DayOfTheWeek.values()
    dayOfTheWeek.forEach { println("${it.ordinal}. ${it.name}") }

    println(DayOfTheWeek.valueOf("Senin"))

    val today = DayOfTheWeek.valueOf("Senin")

    when(today){
        DayOfTheWeek.Senin -> println("KULIAHHHHHHHHHHHHHH")
        DayOfTheWeek.Selasa -> println("Kuliah Lagi")
        DayOfTheWeek.Rabu -> println("Dan lagi")
        DayOfTheWeek.Kamis -> println("Dan Lagi")
        else -> println()
    }



}