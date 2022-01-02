fun main() {
    val n = readLine()!!.toInt()
    var A = 0
    var B = 0
    var C = 0
    var D = 0
    repeat(n) {
        val input = readLine()!!.toInt()
        when(input) {
            2 -> D++
            3 -> C++
            4 -> B++
            5 -> A++
        }
    }
    print("$D $C $B $A")
}