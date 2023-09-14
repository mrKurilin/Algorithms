package leetcode

class `228 Summary Ranges` {

    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.size == 0) {
            return emptyList()
        }

        val summaryRanges = mutableListOf<String>()
        var currentRangeStart = nums[0]
        var currentRangeEnd = nums[0]
        for (i in 1..nums.size - 1) {
            if (nums[i] == nums[i - 1] + 1) {
                currentRangeEnd = nums[i]
            } else {
                if (currentRangeStart == currentRangeEnd) {
                    summaryRanges.add("$currentRangeStart")
                } else {
                    summaryRanges.add("$currentRangeStart->$currentRangeEnd")
                }
                currentRangeStart = nums[i]
                currentRangeEnd = nums[i]
            }
        }

        if (currentRangeStart == currentRangeEnd) {
            summaryRanges.add("$currentRangeStart")
        } else {
            summaryRanges.add("$currentRangeStart->$currentRangeEnd")
        }

        return summaryRanges
    }
}