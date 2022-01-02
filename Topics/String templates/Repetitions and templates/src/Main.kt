fun main() {
    val string = readLine()!!
    val N = string.length
    print("$N repetitions of the word $string: ")
    repeat(N){print(string)}
}