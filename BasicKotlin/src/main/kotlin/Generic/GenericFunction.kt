package Generic

fun <T>sayHello(param:T){
    println("Halo $param")
}

fun main(){
    sayHello("Budi")
    sayHello(123)
    sayHello(true)
}