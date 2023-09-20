package leetcode

class `35 Search Insert Position` {

    fun searchInsert(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.lastIndex
        while (l <= r) {
            val m = ((r.toLong() + l) / 2).toInt()
            if (nums[m] == target) {
                return m
            } else if (nums[m] > target) {
                r = m - 1
            } else {
                l = m + 1
            }
        }
        return l
    }
}