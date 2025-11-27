package FunctionalPrograming

fun compose(f:(Int)-> Int, g:(Int)-> Int): (Int)->Int{
    return{
        x: Int ->f(g(x))
    }
}

fun a(x: Int) = x*x
fun b(x: Int) = x+1

fun main() {
    val result = compose(::a, ::b)

    println(result(5))
}