fun main() {
    val finalExam = 'B'
    val nilaiLulus = arrayOf('A','B')

    when(finalExam){
        'A', 'B' -> println("Kamu Lulus")
        'C' -> println("Ya, Bisa Lulus")
        else -> println("Tidak Lulus")
    }

    when{
        finalExam == 'A' || finalExam == 'B' ->println("Kamu Lulus")
        finalExam == 'C' -> println("Ya, Bisa lulus")
        else -> println("Tidak Lulus")
    }
    var nilai = 0
    when{
        nilai < 10 -> {
            nilai += 5
            println("Nilai Anda: $nilai")
        }
    }

    var status = when(finalExam){
        in nilaiLulus -> println("Kamu Lulus")
        !in nilaiLulus -> println("Ya, Bisa Lulus")
        else -> println("Tidak Lulus")
    }

    when(finalExam){
        is Char -> println("ya, Ini Char")
        !is Char -> println("Bukan Char")
    }

}