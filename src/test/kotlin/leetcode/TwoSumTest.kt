package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class TwoSumTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(nums: IntArray, target: Int, expected: IntArray) {
        Assertions.assertEquals(
            expected.joinToString(),
            `1 Two Sum`().twoSum(nums, target).joinToString()
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(2, 7, 11, 15),
                    9,
                    intArrayOf(0, 1)
                ),
                Arguments.of(
                    intArrayOf(3, 2, 4),
                    6,
                    intArrayOf(1, 2)
                ),
                Arguments.of(
                    intArrayOf(3, 3),
                    6,
                    intArrayOf(0, 1)
                ),
            )
        }
    }
}