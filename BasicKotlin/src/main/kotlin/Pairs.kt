fun main() {
    //Pair declaration
    val firstUser: Pair<String, Int> = Pair("User 1", 20)
    println(firstUser.first)
    println(firstUser.second)

    val secondUser = "user 2" to 25.08
    println(secondUser.first)
    println(secondUser.second)

    //Pair destructuring
    val (name,age) = firstUser
    print("Nama: ")
    println(name)
    print("Umur:")
    println(age)
}