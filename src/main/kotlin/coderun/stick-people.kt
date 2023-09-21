import java.util.Collections

fun main() {
    val n = readln().toInt()
    val neckRadii = readln().split(" ").map { it.toInt() }
    val collarRadii = readln().split(" ").map { it.toInt() }

    val map = mutableMapOf<Int, Int>()

    repeat(n) {
        var dissatisfaction = 0

        for (i in neckRadii.indices) {
            val diff = collarRadii[i] - neckRadii[i]

            dissatisfaction += if (collarRadii[i] < neckRadii[i]) {
                0
            } else if (diff <= 100) {
                diff / 2
            } else {
                30
            }
        }

        map[it+1] = dissatisfaction

        Collections.rotate(neckRadii, -1)
    }

    val minDissatisfaction = map.minBy { it.value }.value
    val resultEntry = map.filter { it.value == minDissatisfaction }.minBy { it.key }

    println("${resultEntry.key} ${resultEntry.value}")
}