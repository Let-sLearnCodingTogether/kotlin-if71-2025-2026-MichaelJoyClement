package OverloadingAndConvention

class GameCharacter(val inventory:List<String>){
    operator fun contains(item: String): Boolean{
        return inventory.contains(item)
    }
}

fun main() {
    val characterInventory = listOf<String>("Pedang", "Potion", "Ranjau")
    println("Pedang" in characterInventory)
    println("Potion" !in characterInventory)
    println("Ranjau" in characterInventory)
}