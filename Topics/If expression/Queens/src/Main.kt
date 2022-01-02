import java.lang.Math.abs

fun main() {
    val a = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val b = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    print( if (a[0] == b[0] || a[0] == b[1] || a[1] == b[0] || a[1] == b[1]) {
        "YES"
    }
    else if(abs(a[0]-a[1]) == abs(b[0]-b[1])){
        "YES"
    }
    else if(a[0]+a[1] == b[0]+b[1]){
        "YES"
    } else
        "NO"
    )
}