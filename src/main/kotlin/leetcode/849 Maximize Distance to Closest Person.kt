package leetcode

import kotlin.math.max

class `849 Maximize Distance to Closest Person` {

    fun maxDistToClosest(seats: IntArray): Int {
        var maxDistance = 0
        var currentDistance = 0
        var wasOccupyBefore = false

        seats.forEach { seat ->
            if (seat == 0) {
                currentDistance++
            } else {
                currentDistance = if (!wasOccupyBefore) {
                    currentDistance
                } else if (currentDistance % 2 == 0) {
                    currentDistance / 2
                } else {
                    currentDistance / 2 + 1
                }
                maxDistance = max(maxDistance, currentDistance)
                wasOccupyBefore = true
                currentDistance = 0
            }
        }
        maxDistance = max(maxDistance, currentDistance)
        return maxDistance
    }
}