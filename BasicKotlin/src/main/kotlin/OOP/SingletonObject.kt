package OOP

<<<<<<< HEAD
object DatabaseConnection{
    fun connect(){
        println("Connecting to Database")
    }
    fun disconnect(){
        println("Disconnectiong from database...")
=======
object DatabaseConnection {
    fun connect(){
        println("Connecting to database...")
    }

    fun disconnect() {
        println("Disconnecting from database...")
>>>>>>> cba83534530f700d134776eb9aa950d7b97acbbb
    }
}

fun main() {
    DatabaseConnection.connect()
    DatabaseConnection.disconnect()
}