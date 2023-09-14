package leetcode

class `1493 longestSubarray` {

    fun longestSubArray(nums: IntArray): Int {
        if (!nums.contains(0)) {
            return nums.size - 1
        }

        var maxLength = 0
        var currentLength = 0
        var lastLength = 0

        for (i in nums.indices) {
            if (nums[i] == 1) {
                currentLength++
                lastLength++
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength
                }
                currentLength = lastLength
                lastLength = 0
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength
        }

        return if (maxLength == nums.size) {
            nums.size - 1
        } else {
            maxLength
        }
    }
}