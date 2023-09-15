package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FindDifferenceTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(nums1: IntArray, nums2: IntArray, expected: List<List<Int>>) {
        Assertions.assertEquals(
            expected,
            `2215 Find the Difference of Two Arrays`().findDifference(nums1, nums2)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(1, 2, 3),
                    intArrayOf(2, 4, 6),
                    listOf(listOf(1, 3), listOf(4, 6))
                ),
                Arguments.of(
                    intArrayOf(1, 2, 3, 3),
                    intArrayOf(1, 1, 2, 2),
                    listOf(listOf(3), listOf())
                ),
            )
        }
    }
}