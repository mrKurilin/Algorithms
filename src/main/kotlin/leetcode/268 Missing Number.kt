package leetcode

class `268 Missing Number` {

    fun missingNumber(nums: IntArray): Int {
        var l = 0
        var r = nums.lastIndex
        val sortedNums = nums.sorted()
        while (l <= r) {
            val currentIndex = ((l.toLong() + r) / 2).toInt()
            if (sortedNums[currentIndex] != currentIndex) {
                r = currentIndex - 1
            } else {
                l = currentIndex + 1
            }
        }
        return l
    }
}