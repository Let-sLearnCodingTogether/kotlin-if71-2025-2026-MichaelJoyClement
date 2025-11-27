package FunctionalPrograming

fun addPureFunction(a:Int, b: Int): Int = a+b

var count = 0
fun addImpureFunction(a: Int): Int{
    count+=a

    return count
}

fun main() {
    addPureFunction(1, 2)
    addPureFunction(1, 2)
    addPureFunction(1, 2)

    println(addImpureFunction(2))
    println(addImpureFunction(2))
}