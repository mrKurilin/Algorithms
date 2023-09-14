package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class LongestSubArrayTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(nums: IntArray, expected: Int) {
        Assertions.assertEquals(
            expected,
            `1493 longestSubarray`().longestSubArray(nums)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(1, 1, 0, 1),
                    3
                ),
                Arguments.of(
                    intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1),
                    5
                ),
                Arguments.of(
                    intArrayOf(1, 1, 1),
                    2
                ),
                Arguments.of(
                    intArrayOf(0, 0, 0),
                    0
                ),
                Arguments.of(
                    intArrayOf(0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1),
                    4
                ),
            )
        }
    }
}