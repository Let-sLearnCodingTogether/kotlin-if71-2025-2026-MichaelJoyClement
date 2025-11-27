package FunctionalPrograming

fun calculate(x: Int, y: Int, operation:(Int, Int)-> Int): Int{
    return operation(x,y)
}
fun sum(a: Int, b: Int)= a+b

fun main() {
    val result = calculate(x=1, y=2, operation = sum)

    println(result)
}