package Generic

class exampleGeneric(val data: Any)

class exampleGeneric2<T>(val data:T)

//Koe kotlin tanpa Generic
//Jika ini di run pasti error karena sistem berusaha membaca Int dari String "Halo"
fun main1() {
    val kotakAngka = exampleGeneric(100)
    val kotakKata = exampleGeneric("Halo")

    //Masalah 1: Harus melakukan casting manual (konversi tipe)
    //Harus memaksa compiler percaya bahwa data adalah int

    val hasil =kotakAngka.data as Int
    println(hasil+10)

    //Rawan error runtime
    // Compiler tiak akan ada masalah tapi di aplikasi akan CRASH saat dijalankan
    //Error tsb terjadi karena aplikasi berusaha mengubah string "Halo" menjadi Int

    val errorNanti = kotakKata.data as Int
}

//Kode kotlin dengan generic
fun main2() {
    val kotakAngka = exampleGeneric2<Int>(100)
    val kotakKata = exampleGeneric2<String>("Halo")

    val hasil =kotakAngka.data
    println(hasil+10)
    val kata = kotakKata.data
    println(kata)
}

fun main() {
    //Hapus fungsi main1 untuk menjalankan tanpa error
    main1()
    main2()
}