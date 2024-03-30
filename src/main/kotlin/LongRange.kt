//fun main() {
//    val longRange = 1000000000L..1000000010L
//
//    for (number in longRange){
//        println(number)
//    }
//}

fun main() {
    val star = 1L
    val end = 10L
    val range = star..end
    var product: Long = 1
    for (number in range){
        product *= number
    }
    println("Aralıktaki sayıların çarpımı: $product")
}