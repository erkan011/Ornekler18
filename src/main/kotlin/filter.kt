//fun main() {
//    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
//    val evenNumbers = numbers.filter { it % 2 == 0 }
//    println("Çift Sayılar: $evenNumbers")
//} //çıktı: Çift Sayılar: [2, 4, 6, 8, 10]
fun main() {
    val words = listOf("elma", "muz", "kiraz", "üzüm", "kiwi")

    val result = words.filter { it.length > 4 }
    println("4 Harften uzun olan kelimeler: $result")
}