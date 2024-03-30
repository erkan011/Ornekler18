//fun main() {
//    val numbers = listOf(1,2,3,4,5)
//
//    val iterator = numbers.iterator()
//    while (iterator.hasNext()){
//        val number = iterator.next()
//        println(number)
//    }
//}

fun main() {
    val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val evenNumbers = mutableListOf<Int>()

    for (number in numbers){
        if (number % 2 == 0){
            evenNumbers.add(number)
        }
    }
    println("Dizideki Çift Sayılar: $evenNumbers")
}
