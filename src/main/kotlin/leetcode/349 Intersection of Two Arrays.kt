package leetcode

class `349 Intersection of Two Arrays` {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        return nums1.intersect(nums2.toSet()).toIntArray()
    }
}