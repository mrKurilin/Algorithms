package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SearchTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(nums: IntArray, target: Int, expected: Int) {
        Assertions.assertEquals(
            expected,
            `33 Search in Rotated Sorted Array`().search(nums, target)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(4, 5, 6, 7, 0, 1, 2),
                    0,
                    4
                ),
                Arguments.of(
                    intArrayOf(4, 5, 6, 7, 0, 1, 2),
                    3,
                    -1
                ),
                Arguments.of(
                    intArrayOf(1),
                    0,
                    -1
                ),
                Arguments.of(
                    intArrayOf(0, 1, 2, 2, 3, 0, 4, 2),
                    100,
                    -1
                ),
                Arguments.of(
                    intArrayOf(1, 3),
                    1,
                    0
                ),
            )
        }
    }
}