fun main() {
    val numbers = MutableList(100){0}
    val ONE = 1
    val TEN = 10
    val HUNDRED = 100

    numbers[0] = ONE
    numbers[9] = TEN
    numbers[99] = HUNDRED
    // do not touch the lines below 
    println(numbers.joinToString())
}