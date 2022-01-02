fun main() {
    var counter = 0
    while (true) {
        val n = readLine()!!.toInt()
        if (n > 0) {
            counter++
        } else {
            break
        }
    }
    print(counter)
}