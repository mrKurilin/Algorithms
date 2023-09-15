package leetcode

class `283 Move Zeroes` {

    fun moveZeroes(nums: IntArray) {
        val result = IntArray(nums.size) { 0 }
        var i = 0
        nums.forEach { num ->
            if (num != 0) {
                result[i++] = num
            }
        }
        result.forEachIndexed { index, num ->
            nums[index] = num
        }
    }
}