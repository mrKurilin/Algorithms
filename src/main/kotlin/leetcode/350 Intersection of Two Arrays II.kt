package leetcode

class `350 Intersection of Two Arrays II` {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val nums2list = nums2.toMutableList()
        val result = mutableListOf<Int>()
        nums1.forEach { int ->
            if (nums2list.remove(int)){
                result.add(int)
            }
        }
        return result.toIntArray()
    }
}