package leetcode

class `1 Two Sum` {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index, int ->
            val toFind = target - int
            val findedIndex = nums.indexOfLast { it == toFind }
            if (findedIndex != -1 && findedIndex != index) {
                return intArrayOf(index, findedIndex)
            }
        }
        return intArrayOf()
    }
}