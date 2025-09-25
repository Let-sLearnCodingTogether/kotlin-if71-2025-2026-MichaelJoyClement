fun main() {
    println("Siapa nama Kamu ?")
    val namaPemain = readln()

    var kesehatanPemain = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2

    var sedangBermain = true

    while (sedangBermain == true){
        println("Nama : $namaPemain")
        println("HP : $kesehatanPemain")
        println("Potion left : $jumlahPotion")

        println("Pilih Jalan yang akan anda ambil (1/2):")
        var pilihJalur = readln()
        var nextRoom = ""

        if (pilihJalur == "1"){
            println("Kamu Mengambil Jalur Gelap dan Seram")
            nextRoom = "Ruang Teka Teki"
            println("Pemain Masuk $nextRoom")
        }
        if (pilihJalur == "2"){
            println("Kamu Mengambil Jalur Tenang dan Sunyi")
            println("Pemain Menginjak Perangkap")
            kesehatanPemain -= 25
            println("Nyawa Anda berkurang sebanyak 25")
            println("Sisa Nyawa anda adalah $kesehatanPemain")
            if (kesehatanPemain <= 0){
                println("Anda Mati")
                sedangBermain = false
            }

        }
        while (punyaKunciEmas == false){
            if (pilihJalur == "1"){
                println("Kmau Berada disebuah ruangan dengan tiga patung: naga, griffin, dan ular")
                println("Pilih patung mana yang ingin anda interact")
                var pilihanPatung = readln().lowercase()
                when{
                    pilihanPatung == "naga" ->{
                        println("Anda disembur Naga")
                        kesehatanPemain -= 35
                        if (kesehatanPemain <= 0){
                            println("Anda Mati")
                            sedangBermain = false
                        }
                        println("Nyawa Anda berkurang sebanyak 35")
                        println("Sisa Nyawa anda adalah $kesehatanPemain")
                    }

                    pilihanPatung == "griffin" ->{
                        println("Anda Mendapatkan Kunci Emas!")
                        punyaKunciEmas = true
                    }
                    pilihanPatung == "ular" ->{
                        println("Anda digigit ular!")
                        kesehatanPemain -= 15
                        if (kesehatanPemain <= 0){
                            println("Anda Mati")
                            sedangBermain = false
                        }
                        println("Nyawa Anda berkurang sebanyak 15")
                        println("Sisa Nyawa anda adalah $kesehatanPemain")
                    }

                    else -> println("Game Over")
                }

                println("Apakah Anda ingin menggunakan potion? (y/n)")
                var pakaiPotion = readln().lowercase()
                if (pakaiPotion == "y")
                {
                    if(kesehatanPemain >= 100){
                        println("Kesehatan anda masih penuh tidak bisa menggunakan potion")
                    }else{
                        kesehatanPemain+=10
                        jumlahPotion -= 1
                        println("Anda Menggunakan Potion, kesehatan anda dipulihkan sebesar 15")
                        println("Poin kesehatan anda sekarang adalah $kesehatanPemain")
                    }
                }
                else{
                    println("Anda memilih tidak menggunakan potion")
                }
        }

            if (kesehatanPemain <= 0){
                println("Anda Mati")
                sedangBermain = false
            }
            if (punyaKunciEmas == true){
                println("Kamu menggunakan Kunci emas dan menemukan atrefak kuno!")
                break
            }
            if (punyaKunciEmas == false){
                println("Pintu Terkunci dan membutuhkan Kunci emas")
                continue
            }

        }
    }
}