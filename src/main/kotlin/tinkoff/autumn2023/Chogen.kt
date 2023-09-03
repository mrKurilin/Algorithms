package tinkoff.autumn2023

class Chogen {

    fun main() {
        val (townsCount, roadsCount) = readln().trim().split(" ").map { it.toInt() }
        val roads = mutableListOf<Road>()
        repeat(roadsCount) {
            val (from, to, length) = readln().trim().split(" ").map { it.toInt() }
            roads.add(Road(from, to, length))
            roads.add(Road(to, from, length))
        }

        val initStatesCount = getStatesCount(townsCount, roads)
        var maxRemoved = 0
        var x = 0

        val maxLength = roads.maxBy { it.length }.length
        val minLength = roads.minBy { it.length }.length

        for (length in maxLength downTo minLength) {
            val newRoads = roads.filter { it.length <= length }
            if (getStatesCount(townsCount, newRoads) == initStatesCount){
                val currentRemovedRoads = roads.size-newRoads.size
                if (currentRemovedRoads>maxRemoved) {
                    maxRemoved = currentRemovedRoads
                    x = length
                }
            }
        }

        print(x)
    }

    fun getStatesCount(townsCount: Int, roads: List<Road>): Int {
        var statesCount = 0
        val townsInStates = mutableListOf<Int>()
        val currentStateTowns = mutableListOf<Int>()
        for (i in 1..townsCount + 1) {
            currentStateTowns.clear()
            if (i in townsInStates) {
                continue
            }

            if (roads.filter { it.from == i }.isEmpty()) {
                statesCount++
                townsInStates.add(i)
            } else {
                currentStateTowns.add(i)
                currentStateTowns.addAll(getAllDestinations(i, roads))
                townsInStates.addAll(currentStateTowns)
                if (stateIsOk(currentStateTowns, roads)) {
                    statesCount++
                }
            }
        }
        return statesCount
    }

    private fun stateIsOk(
        currentStateTowns: List<Int>,
        roads: List<Road>
    ): Boolean {
        currentStateTowns.forEach { townFrom ->
            currentStateTowns.forEach { townTo ->
                if (!ableToGo(townFrom, townTo, roads)) {
                    return false
                }
            }
        }
        return true
    }

    fun getAllDestinations(from: Int, roads: List<Road>): List<Int> {
        val destinations = mutableListOf<Int>()
        roads.filter { it.from == from }.forEach { road ->
            destinations.add(road.to)
            val newRoads = roads.filter { it.to != road.to && it.from != from}
            destinations.addAll(getAllDestinations(road.to, newRoads))
        }
        return destinations
    }

    fun ableToGo(from: Int, to: Int, roads: List<Road>): Boolean {
        if (roads.any { it.to == to && it.from == from }) {
            return true
        }

        val xRoads = roads.filter { it.from == from }

        for (road in xRoads) {
            if (ableToGo(road.to, to, roads)) {
                return true
            }
        }

        return false
    }

    data class Road(
        val from: Int,
        val to: Int,
        val length: Int
    )
}