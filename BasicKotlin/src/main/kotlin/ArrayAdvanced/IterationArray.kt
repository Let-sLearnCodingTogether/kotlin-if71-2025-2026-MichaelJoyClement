fun main() {
    var users: Array<String> = arrayOf("User 1", "User 2", "User 3", "User 4")

    //Using foreach
    users.forEach {
        println("Foreach: $it")
    }

    users.forEach {
        user->println("Foreach: $user")
    }

    users.forEachIndexed {
        index, user->println("Foreach Index: ${index+1} : $user")
    }

    //Using for
    for (user in users){
        println("Foreach: $user")
    }

}