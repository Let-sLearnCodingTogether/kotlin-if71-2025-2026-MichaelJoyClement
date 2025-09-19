package Array

fun main() {
    val user: Array<String> =arrayOf("User 1", "User 2","User 3")
    val nilai: Array<Int> =arrayOf(1,2,3,4,5)

    println(user[2])
    println(user.get(2))

    user.set(2, "user 3 Update")
    println("Nilai User Setelah di Update: ${user[2]}")
    println("Ukuran Array : ${user.size}")
    println()
}