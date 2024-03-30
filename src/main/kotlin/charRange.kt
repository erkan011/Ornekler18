fun main() {
    val text = "Merhaba Kotlin!"

    val charRange = 'a'..'z'
    var count = 0
    for (char in charRange){
        if (char in text) {
            count++
        }
    }
    println("Metindeki küçük harf sayısı: $count")
}