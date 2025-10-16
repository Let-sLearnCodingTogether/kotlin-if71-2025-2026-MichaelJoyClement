fun main() {
    val daftarMahasiswa = listOf(
        Pair("Budi", 3.8),
        Pair("Ani", 3.5),
        Pair("Doni", 3.7)
    )
    //Tanpa Lamda
    for (mahasiswa in daftarMahasiswa){
        if(mahasiswa.second > 3.5){
            println(mahasiswa.first)
        }
    }

    //Dengan Lamda

    val mahasiswa = daftarMahasiswa
        .filter{it.second>3.5}
        .map { it.first }

    println(mahasiswa)
}