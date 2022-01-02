fun main() {
    var input = 1
    var max = Int.MIN_VALUE
    while (input != 0) {
        input = readLine()!!.toInt()
        if (input > max) {
            max = input
        }
    }
    print(max)
}