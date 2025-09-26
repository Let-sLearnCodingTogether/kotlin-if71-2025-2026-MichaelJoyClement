fun String.greeting(): String{
    return "Hello, $this"
}

fun Int.isEven(): Boolean{
    return this%2 == 0
}

fun main(){
    val username: String = "Budi"
    val number: Int = 17
    println(username.greeting())
    println(number.isEven())
}

