fun List<Int>.sum1():Int{
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}


fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
    val sum = sum(listOf(1, 2, 3))
    println(sum)    // 6
    val sum2 = listOf(1, 2, 3).sum1()
    println(sum2)
}