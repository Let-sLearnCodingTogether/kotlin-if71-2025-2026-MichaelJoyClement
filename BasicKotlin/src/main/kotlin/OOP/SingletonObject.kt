package OOP

object DatabaseConnection{
    fun connect(){
        println("Connecting to Database")
    }
    fun disconnect(){
        println("Disconnectiong from database...")
    }
}

fun main() {
    DatabaseConnection.connect()
    DatabaseConnection.disconnect()
}