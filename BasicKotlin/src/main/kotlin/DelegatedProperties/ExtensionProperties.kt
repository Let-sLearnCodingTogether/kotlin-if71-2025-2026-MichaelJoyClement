package DelegatedProperties

//class yang kita tidak punya akses
class UserProfile(val username: String){

}

val UserProfile.usernameUppercase: String
    get() = this.username.uppercase()

fun main() {
    val user1 = UserProfile("Joy")
    println(user1.username)
    println(user1.usernameUppercase)
}