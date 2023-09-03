package tinkoff.autumn2023

class Chogen {

    fun main() {
        val (_, roadsCount) = readln().trim().split(" ").map { it.toInt() }
        val roads = mutableListOf<Road>()
        repeat(roadsCount) {
            val (from, to, length) = readln().trim().split(" ").map { it.toInt() }
            roads.add(Road(from, to, length))
        }


    }

    data class Road(
        val from: Int,
        val to: Int,
        val length: Int
    )
}