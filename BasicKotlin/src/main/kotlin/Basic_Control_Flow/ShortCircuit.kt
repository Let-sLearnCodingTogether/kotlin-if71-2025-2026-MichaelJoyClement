package Basic_Control_Flow

fun main() {
    val isLoggedIn = false
    if(isLoggedIn && (5/0 == 0)){
        println("User Has Access")
    }else{
        println("Access denied")
    }
}