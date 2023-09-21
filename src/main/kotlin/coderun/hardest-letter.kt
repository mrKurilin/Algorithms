fun main() {
    val n = readln().toInt()
    val string = readln()
    val milliseconds = readln().split(" ").map { it.toInt() }

    var maxTime = milliseconds[0]
    var resChar = string[0]

    for (i in 1 until n) {
        val time = milliseconds[i] - milliseconds[i-1]
        if (time >= maxTime) {
            maxTime = time
            resChar = string[i]
        }
    }

    println(resChar)
}