package FunctionalPrograming

fun main() {
    val numbers = listOf(1,2,3,4,5)
    val doubled = numbers.map { it*2 }
    val even = numbers.filter { it%2 == 0 }
    val sum = numbers.reduce { acc, i->acc+i }

    println(doubled)
    println(even)
    println(sum)

}