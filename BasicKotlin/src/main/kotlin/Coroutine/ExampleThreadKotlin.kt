package Coroutine

fun main() {
    val thread0 = Thread{
        println("Thread 0: ${Thread.currentThread().name}")
        Thread.sleep(2_000)
        println("Hello dari Thread 0")
    }

    val thread1 = Thread{
        println("Thread 0: ${Thread.currentThread().name}")
        Thread.sleep(2_000)
        println("Hello dari Thread 1")
    }

    thread0.start()
    thread1.start()
}