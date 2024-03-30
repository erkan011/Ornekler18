fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0,10,11,12,13)
    numbers.forEachIndexed { index, value ->
        println("Index: $index, Değer: $value")
    }

    val numberx = listOf(1,2,3,4,5)
    numberx.forEach { number ->
        println(number*2)
    }
}