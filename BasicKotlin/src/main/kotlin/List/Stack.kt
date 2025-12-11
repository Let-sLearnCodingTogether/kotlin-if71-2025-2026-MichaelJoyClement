package List

interface Stack<Element>{
    fun push(element: Element)
    fun pop():Element?
}

class StackImpl<T: Any>: Stack<T>{
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
}

fun main() {
    val stack = StackImpl<Int>()
    println("Test Stack Push")
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack)

    println("Test Stack Pop")
    stack.pop()
    println(stack)
}