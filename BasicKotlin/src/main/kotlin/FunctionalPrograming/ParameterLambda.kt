package FunctionalPrograming

fun operateOnNumber(a: Int, b: Int, operation:(Int, Int) ->Unit){
    return operation(a,b)
}

fun main() {
    val operasi1 = operateOnNumber(1,2){x,y->println(x+y)}

    val result1 = operateOnNumber(1,3){x,y->x*y}
    println(result1)


}