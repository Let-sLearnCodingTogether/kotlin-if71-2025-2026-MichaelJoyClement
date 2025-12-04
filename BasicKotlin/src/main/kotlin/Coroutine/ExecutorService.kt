package Coroutine

import java.util.concurrent.Executors

fun main() {
    val executor = Executors.newFixedThreadPool(3)
    val executor2 = Executors.newCachedThreadPool()
    val executor3 = Executors.newSingleThreadExecutor()

    for(i in 1..10){
        executor3.submit {
            val threadName = Thread.currentThread().name

            println("Tugas $i berjalan di thread $threadName")
            Thread.sleep(1_000)
        }
    }
    executor3.shutdown()
}