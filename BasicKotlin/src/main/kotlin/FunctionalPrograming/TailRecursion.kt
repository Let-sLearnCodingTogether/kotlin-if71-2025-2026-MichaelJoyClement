package FunctionalPrograming

fun factorial(n: Int): Long{
    return if(n == 1) 1 else n*factorial(n-1)
}

tailrec fun factorial(n: Int, acc: Long = 1): Long{
    return if(n==1) acc else factorial(n-1, acc*n)
}

tailrec fun fibonacci(n: Int, a: Long = 0, b: Long= 1): Long{
    return if(n==0) a else fibonacci(n-1,b,a+b)
}

fun main() {
    val factorial1 = factorial(10)
    println(factorial1)
}