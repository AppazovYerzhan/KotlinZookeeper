fun main() {
    val n = readLine()!!.toInt()
    var counter = 0
    repeat(n) {
        val input = readLine()!!.toInt()
        if (input > 0) {
            counter++
        }
    }
    print(counter)
}