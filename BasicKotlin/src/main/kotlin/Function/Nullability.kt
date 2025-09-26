fun main() {
    var student: String = "Budi"
    println(student)

//    student= null

    var prodiIf: String?=null
    val prodiSI: String?=null
    println(prodiIf?.length)
    println(prodiSI ?: "Tanpa Prodi")

//    var token: String? = null
//    println(token!!.length)
//
    val email:String? = "test1@gmail.com"
    if(email != null){
        println("Panjang Email: ${email.length}")
    }

}