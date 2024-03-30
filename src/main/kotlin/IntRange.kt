//fun main() {
//    val intRange = 1..5
//    for (number in intRange){
//        println(number)
//    }
//}

fun main() {
    println("Başlangıç sayıyı giriniz: ")
    val start = readlnOrNull()?.toIntOrNull() ?: return

    println("Bitiş sayıyı giriniz: ")
    val end = readlnOrNull()?.toIntOrNull() ?: return

    val range = start..end
    var sum = 0

    for (number in range){
        sum += number
    }
    println("Toplam: $sum")
}