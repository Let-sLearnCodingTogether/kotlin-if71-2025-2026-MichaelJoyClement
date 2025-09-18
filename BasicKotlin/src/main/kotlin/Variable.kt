const val APP_NAME = "Kotlin"
const val APP_Version = "0.0.1"

fun main() {
    var playerScore = 100
    val npm = "2226250041"

    println(playerScore)
    println("NPM Saya "+npm)

    playerScore = 103
//    npm = "2226250042" Tidak akan bisa diubah karena bentuk data val, yang bisa diubah hanya var
    println(playerScore)
}