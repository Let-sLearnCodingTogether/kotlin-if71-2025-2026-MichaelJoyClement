package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi Dimulai")
    login()
    println("Pindah Halaman dari login, ke home")
}

suspend fun login(){
    println("Melakukan validasi email & Password")
    delay(2_000)
    println("Validasi Sukses")
}