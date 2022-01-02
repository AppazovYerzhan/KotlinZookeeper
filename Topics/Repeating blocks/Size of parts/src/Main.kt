fun main() {
    val n = readLine()!!.toInt()
    var p = 0
    var l = 0
    var r = 0
    repeat(n) {
        val input = readLine()!!.toInt()
        when (input) {
            0 -> p++
            1 -> l++
            -1 -> r++
        }
    }
    print("$p $l $r")
}