package LatihanUAS.Soal1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")
    launch {
        println("Download data")
        delay(3_000)
    }
    println("Aplikasi Selesai")
}

