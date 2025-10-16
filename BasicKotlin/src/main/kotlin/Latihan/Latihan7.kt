data class GameItem(val id: Int, val name: String, val value: Int, val rariy: String){

}

fun main() {
    var pedangBesi = GameItem(1, "Pedang Besi", 100000, "Common")
    var ramuanKesehatan = GameItem(2, "Ramuan Kesehatan", 110000, "Common")
    var jubahBayangan = GameItem(3, "Jubah Bayangan", 100_000_000, "Epic")

    val ListGameItem = listOf<GameItem>(
        GameItem(1, "Pedang Besi", 100000, "Common"),
        GameItem(2, "Ramuan Kesehatan", 110000, "Common"),
        GameItem(3, "Jubah Bayangan", 100_000_000, "Epic")
    )


    var cursedSword = ListGameItem[0].copy(name = "Pedang Besi Terkutuk", value = 250)
    println(cursedSword)
    println(ListGameItem[0])


}