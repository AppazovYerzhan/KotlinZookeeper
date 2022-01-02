import java.util.*
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    if (a>0 || b>0 || c>0) {
        if (a > 0) {
            if (b <= 0 && c <= 0) {
                print(true)
                return
            } else {
                print(false)
                return
            }
        }
        if (b > 0) {
            if (a <= 0 && c <= 0) {
                print(true)
                return
            } else {
                print(false)
                return
            }
        }
        if (c > 0) {
            if (b <= 0 && a <= 0) {
                print(true)
                return
            } else {
                print(false)
                return
            }
        }
    }
    else {
        print(false)
    }
}
