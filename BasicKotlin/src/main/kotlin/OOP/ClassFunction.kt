package OOP

class MahasiswaFunction(val nama: String){
    fun sayHello(){
        println("Selamat Malam $nama")
    }

    fun sayHello(word: String){
        println("$word $nama")
    }
}



fun main() {
    val mahasiswaPertama = MahasiswaFunction(nama= "Joy")

    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("Selamat Pagi")
}