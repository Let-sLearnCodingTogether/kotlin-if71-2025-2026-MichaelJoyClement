fun sayHello1(firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}

fun main() {
    sayHello1("Michael","Joy")
    sayHello1("Joy")
}