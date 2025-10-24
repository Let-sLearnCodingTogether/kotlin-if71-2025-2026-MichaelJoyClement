package Latihan

class Player (val name: String){
    var health: Int = 100
    var level: Int = 1

    fun taheDamage(damage: Int){
        if (health > 0){
            health-=damage
        }
        else{
            println("Nyawa anda mencapai 0.")
        }
    }

    fun levelUp(){
        level+=1
        health = 100
    }

    fun showStatus(){
        println("Status Pemain")
        println("Nama Pemain: $name, Level: $level. Health: $health")
    }

}

fun main() {
    var player = Player("Joy")

    player.showStatus()
    player.taheDamage(30)
    player.showStatus()
    player.levelUp()
    player.showStatus()
}