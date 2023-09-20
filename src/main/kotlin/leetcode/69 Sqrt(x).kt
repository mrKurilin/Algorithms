package leetcode

class `69 Sqrt(x)` {

    fun mySqrt(x: Int): Int {
        var l = 0
        var r = 46340
        while (l <= r) {
            val m = (r + l / 2)
            val current = m * m
            if (current == x) {
                return m
            } else if (current < x) {
                l = m + 1
            } else {
                r = m - 1
            }
        }
        return r
    }
}