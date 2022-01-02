import java.lang.Math.*

fun main() {
    val a = readLine()!!.split(" ").toMutableList()
    val b = readLine()!!.split(" ").toMutableList()
    print( if(abs(b[0].toInt() - a[0].toInt()) == 1 && abs(b[1].toInt() - a[1].toInt()) == 2
        || abs(b[0].toInt() - a[0].toInt()) == 2 && abs(b[1].toInt() - a[1].toInt()) == 1) "YES"
    else
        "NO"
    )
}