package leetcode

class `169 Majority Element` {

    fun majorityElement(nums: IntArray): Int {

        val map = mutableMapOf<Int, Int>()

        nums.forEach {
            if (map[it] == null) {
                map[it] = 1
            } else {
                map[it] = map[it]!! + 1
            }
        }

        map.forEach { entry ->
            if (entry.value > nums.size / 2) {
                return entry.key
            }
        }

        return 0
    }
}