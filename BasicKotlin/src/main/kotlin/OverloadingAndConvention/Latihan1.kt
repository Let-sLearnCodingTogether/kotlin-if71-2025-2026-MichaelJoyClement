package OverloadingAndConvention

data class Mana(var current: Int, var max: Int){
    operator fun plus(other: Mana): Mana{
        if(other.max > max){
            return Mana(current+other.current, other.max)
        }
        else{
            return Mana(current+other.current, max)
        }
    }

    operator fun inc(): Mana{
        if (current+10 <= max){
            return Mana(current+10, max)
        }
        else{
            return Mana(current,max)
        }
    }

    operator fun minus(other: Int): Mana{
        if (current-other < 0){
            println("Tidak Bisa mengurangi Mana karena Hasilnya akan negatif")
            return Mana(current, max)
        }
        return Mana(current-other, max)
    }
}

fun main() {
    var mana1 = Mana(50,100)
    var mana2 = Mana(20,150)

    println(mana1+mana2)

    mana1++
    println(mana1)

    println(mana1-100)
}