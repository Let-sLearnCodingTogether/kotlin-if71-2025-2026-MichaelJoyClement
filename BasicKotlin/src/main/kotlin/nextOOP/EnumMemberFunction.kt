package nextOOP

enum class DayOfTheWeek3(val isWeekend: Boolean = false){
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu(true),
    Minggu(true);

    companion object{
        fun today(): DayOfTheWeek3{
            val today = 0
            return DayOfTheWeek3.values().first{it.ordinal == today}
        }
    }

    fun daysUntilWeekend(target: DayOfTheWeek3): Int{
        return if(this.ordinal < target.ordinal){
            target.ordinal-this.ordinal
        }
        else{
            this.ordinal- target.ordinal
        }
    }
}

fun main(){
    val today = DayOfTheWeek3.Jumat
    val targetHari = DayOfTheWeek3.Senin
    val dayOfTheWeek = today.daysUntilWeekend(targetHari)
    println(dayOfTheWeek)

    println(DayOfTheWeek3.today())
}