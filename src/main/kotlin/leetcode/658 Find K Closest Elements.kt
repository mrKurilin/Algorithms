package leetcode

import java.lang.Math.abs

class `658 Find K Closest Elements` {

    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        val comparator = Comparator<Int> { a, b ->
            if (abs(a - x) < abs(b - x) || (abs(a - x) == abs(b - x) && a < b)) {
                1
            } else {
                -1
            }
        }
        return arr.sortedWith(comparator).takeLast(k).sorted()
    }
}