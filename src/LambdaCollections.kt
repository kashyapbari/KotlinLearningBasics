fun main() {
    val listOfInt = listOf<Int>(1,2,3,4,5,6,7,8,9);
    val mapOfInt = listOfInt.associate { 'a' + it to it * 10 }
    println(mapOfInt)
    println(mapOfInt.entries.partition {
        it.value > 50
    }.toList().map { it.map { it.key to it.value }.toMap() }
        .zipWithNext()[0]
    )
}