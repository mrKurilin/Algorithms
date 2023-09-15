package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RandomizedSetTest() {

    @Test
    fun test1() {
        val randomizedSet = `380 Insert Delete GetRandom O(1)`()

        assertEquals(
            true,
            randomizedSet.insert(1)
        )
        assertEquals(
            false,
            randomizedSet.remove(2)
        )
        assertEquals(
            true,
            randomizedSet.insert(2)
        )
        assertEquals(
            2,
            randomizedSet.getRandom()
        )
        assertEquals(
            true,
            randomizedSet.remove(1)
        )
        assertEquals(
            false,
            randomizedSet.insert(2)
        )
        assertEquals(
            2,
            randomizedSet.getRandom()
        )
    }
}