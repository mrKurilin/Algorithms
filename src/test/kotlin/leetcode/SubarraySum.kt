package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SubarraySumTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(nums: IntArray, k: Int, expected: Int) {
        Assertions.assertEquals(
            expected,
            `560 Subarray Sum Equals K`().subarraySum(nums, k)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(1, 1, 1),
                    2,
                    2
                ),
                Arguments.of(
                    intArrayOf(1, 2, 3),
                    3,
                    2
                ),
                Arguments.of(
                    intArrayOf(1),
                    1,
                    1
                ),
                Arguments.of(
                    intArrayOf(-1, -1, 1),
                    0,
                    1
                ),
                Arguments.of(
                    intArrayOf(-1, -1, 1),
                    1,
                    1
                ),
                Arguments.of(
                    intArrayOf(1, -1, 0),
                    0,
                    3
                ),
            )
        }
    }
}