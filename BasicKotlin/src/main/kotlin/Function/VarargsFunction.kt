fun arrayList(array1: Array<String>){
    for(index in array1){
       println(index)
    }
}

fun main() {
    val nameArray = arrayOf("Michael", "Joy")
    arrayList(nameArray)
    println()
}