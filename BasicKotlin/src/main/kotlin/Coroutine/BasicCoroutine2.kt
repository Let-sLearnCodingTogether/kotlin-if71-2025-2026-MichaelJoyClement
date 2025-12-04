package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi Dimulai")

    launch {
        updateVersion()
    }

    println("Aplikasi Sedang Digunakan")
}

suspend fun updateVersion(){
    delay(5_000)
    println("Update Selesai")
}