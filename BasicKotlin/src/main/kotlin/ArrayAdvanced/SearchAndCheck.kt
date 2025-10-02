fun main() {
    val ages: Array<Int> = arrayOf(25, 30, 40, 50)

    println("Contains: ${ages.contains(30)}")
    println("Contains: ${ages.contains(55)}")
    println("IndexOf: ${ages.indexOf(40)}")
    println("Any: ${ages.any{it > 10}}")
    println("All: ${ages.any{it > 10}}")
}