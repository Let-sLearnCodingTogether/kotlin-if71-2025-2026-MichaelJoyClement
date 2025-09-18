fun Triple()
{
    //Triple Declaration
    val firstUser = Triple("Joy","20",true)
    val name = firstUser.first

    println(firstUser.first)
    println(firstUser.second)
    println(firstUser.third)

//Triple Destructuring
    val (username, age, logic) = firstUser
    print("Nama: "+username+", Umur: "+age+", Logic: "+logic)
}

fun main() {
    val triple = Triple()
    print(triple)






}