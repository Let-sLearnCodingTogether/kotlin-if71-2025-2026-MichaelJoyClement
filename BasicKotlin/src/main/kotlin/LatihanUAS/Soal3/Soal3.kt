package LatihanUAS.Soal3

interface NilaiAkhir<Element>{
    fun push(element: Element)
    fun pop():Element?
    fun peek():Element?
}

class StackImpl<T: Any>: NilaiAkhir<T>{
    private val storage = arrayListOf<T>()

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if(storage.isEmpty()) return null
        return storage.removeAt(storage.size-1
        )
    }

    override fun toString(): String {
        return storage.asReversed().toString()
    }

    override fun peek(): T? {
        return storage.last()
    }


}

fun main() {
    val stack = StackImpl<Int>()
    println("Test Stack Push")
    stack.push(10)
    stack.push(20)
    stack.pop()
    println(stack.peek())
    println(stack)


}