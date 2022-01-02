fun main() {    
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val H = readLine()!!.toInt()
    print(
        if(H >= A && H <= B) {"Normal"}
    else if (H >= A && H >= B) {"Excess"}
    else {"Deficiency"}
    )
}