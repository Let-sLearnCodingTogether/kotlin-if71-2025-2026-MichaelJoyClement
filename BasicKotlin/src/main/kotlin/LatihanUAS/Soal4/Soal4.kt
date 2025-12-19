package LatihanUAS.Soal4

interface NilaiAkhir <T: Any>{
    fun enqueue(element:T): Boolean
    fun dequeue():T?

    val count: Int
    val isEmpty: Boolean
        get() = count == 0

    fun peek():T?
}

class ArraylistQueue<T: Any>: NilaiAkhir<T>{
    private val list = arrayListOf<T>()

    override fun toString(): String {
        return list.toString()
    }

    override val count: Int
        get() = list.size

    override fun peek():T?{
        return list.getOrNull(0)
    }

    override fun enqueue(element: T): Boolean {
        list.add(element)
        return true
    }

    override fun dequeue(): T? {
        return if(isEmpty) null else list.removeAt(0)
    }
}

fun main() {
    val queue = ArraylistQueue<Int>()

    queue.enqueue(10)
    queue.enqueue(20)
    queue.dequeue()

    println(queue)

    
}