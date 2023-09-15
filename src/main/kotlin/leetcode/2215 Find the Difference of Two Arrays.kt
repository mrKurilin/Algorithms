package leetcode

class `2215 Find the Difference of Two Arrays` {

    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> = listOf(
        nums1.subtract(nums2.toSet()).toList(),
        nums2.subtract(nums1.toSet()).toList(),
    )
}