package Coroutine

import java.util.Date

fun main() {
    val runnable = Runnable{
        println(Date())
        Thread.sleep(2_000)
        println("Hello Runnable 1")
    }

    val runnable2 = Runnable{
        println(Date())
        Thread.sleep(2_000)
        println("Hello Runnable 2")
    }

    val thread0 = Thread(runnable)
    val thread1 = Thread(runnable2)

    thread0.start()
    thread1.start()
}