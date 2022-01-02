fun main() {
    val n = readLine()!!.toInt()
    var max = 0
    repeat(n) {
        val num = readLine()!!.toInt()
        if (num % 4 == 0 && num > max) {
            max = num
        }
    }
        print(max)
}