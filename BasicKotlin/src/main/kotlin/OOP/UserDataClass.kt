package OOP

data class User(val name: String, val age: Int)

fun main() {
    val user = User("Joy", 20)

    println(user)
    val userCopyAge = user.copy(age = 25)
    val userCopy = user.copy()
    println(userCopy)
    println(userCopyAge)

}