package OOP

fun main() {
    val person = object {
        val name =  "Joy"
        val age = 20
        fun  greet(){
            println("Hai")
        }
    }
    println(person.greet())

}