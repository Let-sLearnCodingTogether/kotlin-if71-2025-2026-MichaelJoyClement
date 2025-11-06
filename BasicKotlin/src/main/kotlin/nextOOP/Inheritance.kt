package nextOOP

open class Hewan(val name: String){
    open fun suara(){
        println("Suara Hewan")
    }
}

open class Ayam(name: String): Hewan(name){
    override fun suara(){
        println("Awok Awok")
    }

}

//class AnakAyam(name: String): Ayam(name){
//    override fun suara() {
//        println("AAAAAAAAAAAAAAAAAAAAAAAA")
//    }
//}

fun main() {
    val rambo = Ayam("Rambo")
    rambo.suara()
}