fun main() {
    var ages: Array<Int> = arrayOf(60, 25, 30, 40 ,50, 13, 10)

    println("Ages: ${ages.joinToString()}")


//    ages.sort()
//    println("Sort: ${ages.joinToString()}")

//    ages.sorted()
    var sorted: List<Int> = ages.sorted()
    println("Sorted: ${sorted.joinToString()}")

    ages.reverse()
    println("Reverse: ${ages.joinToString()}")

    println("Slice: ${ages.slice(2..6).joinToString()}")
}