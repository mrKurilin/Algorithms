//  https://coderun.yandex.ru/seasons/first_2023/tracks/mobile-dev/problem/all-paths-lead-to-rome

fun main() {
    val (townsCount, roadsCount) = readln().split(" ").map { it.toInt() }

    val roads = mutableSetOf<Road>()

    repeat(roadsCount) {
        val (from, to) = readln().split(" ").map { it.toInt() }
        roads.add(Road(from, to))
    }

    for (i in 1..townsCount) {
        if (roads.count { road -> road.to == i } != townsCount - 1) {
            continue
        }

        if (roads.count { road -> road.from == i } != 0) {
            continue
        }

        println(i)
        return
    }

    println(-1)
}

data class Road(val from: Int, val to: Int)