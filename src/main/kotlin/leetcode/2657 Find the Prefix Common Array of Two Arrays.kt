package leetcode

class `2657 Find the Prefix Common Array of Two Arrays` {

    fun findThePrefixCommonArray(a: IntArray, b: IntArray) = IntArray(a.size) { i ->
        a.sliceArray(0..i).intersect(b.sliceArray(0..i).toSet()).size
    }
}
