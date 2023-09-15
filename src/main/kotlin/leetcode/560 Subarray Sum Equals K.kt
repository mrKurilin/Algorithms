package leetcode

class `560 Subarray Sum Equals K` {

    fun subarraySum(nums: IntArray, k: Int): Int {
        var result = 0
        for (i in nums.indices) {
            var currentSum = 0
            for (j in i until nums.size) {
                currentSum += nums[j]
                if (currentSum == k) {
                    result++
                }
            }
        }
        return result
    }
}