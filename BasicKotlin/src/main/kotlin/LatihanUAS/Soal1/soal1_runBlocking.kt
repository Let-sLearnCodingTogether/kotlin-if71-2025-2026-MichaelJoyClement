package LatihanUAS.Soal1

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")
    downloadData()
    println("Aplikasi Selesai")
}

suspend fun downloadData(){
    println("Download data")
    delay(3_000)
    println("Download Selesai")
}