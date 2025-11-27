package FunctionalPrograming

val repeatFun: String.(Int)->String = {times ->this.repeat(times)}

fun main() {
    println("Hi".repeatFun(100))
}