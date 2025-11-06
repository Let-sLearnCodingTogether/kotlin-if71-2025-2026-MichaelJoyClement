package nextOOP

abstract  class Printer{
    abstract fun print()

    fun info(){
        println("info Printer")
    }
}

class PrinterLaser(): Printer(){
    override fun print() {
        println("Print dengan menggunakan laser")
    }

}

fun main() {
    val printLaser = PrinterLaser()
    printLaser.print()
    printLaser.info()
}