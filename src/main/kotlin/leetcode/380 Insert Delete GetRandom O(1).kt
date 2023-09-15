package leetcode

class `380 Insert Delete GetRandom O(1)` {

    val mutableSet = mutableSetOf<Int>()

    fun insert(`val`: Int): Boolean {
        return mutableSet.add(`val`)
    }

    fun remove(`val`: Int): Boolean {
        return mutableSet.remove(`val`)
    }

    fun getRandom(): Int {
        return mutableSet.random()
    }
}