fun main() {
    var list1 = listOf(1,2,3,4)
    list1 += 5
//    val list2 = list1 + 5
    println(list1)
//    println(list2)

    println(Point(3,6)*Point(5,5))
}

data class Point(val x:Int, val y:Int)

operator fun Point.times(to: Point) {
    Point(this.x * to.x, this.y * to.y)
}