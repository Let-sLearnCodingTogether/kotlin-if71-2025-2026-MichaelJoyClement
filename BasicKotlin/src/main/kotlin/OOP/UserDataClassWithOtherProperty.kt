package OOP

data class Product(val name: String, val price: Double){
    val isAvailible: Boolean = true

    fun getFormatPrice() : String{
        return "Rp $price"
    }
}

fun main() {
    val product1 = Product("Tahu Bulat", 2000.0)
    println(product1)
    println(product1.isAvailible)
}