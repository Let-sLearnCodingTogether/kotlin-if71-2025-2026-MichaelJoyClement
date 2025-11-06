package nextOOP

open class HewanBaru(val name: String){
    open fun suara(){
        println("Suara Hewan $name")
    }
}

class Kucing(name: String): HewanBaru(name){
    override fun suara() {
        super.suara()
        println("Meong! 🐱")
    }
}

class Bebek(name: String): HewanBaru(name){
    override fun suara() {
        super.suara()
        println("Kwek Kwek!")
    }
}

fun main() {
    val kucing1 = Kucing("Kucing")
    kucing1.suara()

    Kucing("Kucing").suara()
}