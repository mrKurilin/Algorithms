package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SearchInsertTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(nums: IntArray, target: Int, expected: Int) {
        Assertions.assertEquals(
            expected,
            `35 Search Insert Position`().searchInsert(nums, target)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(1, 3, 5, 6),
                    5,
                    2
                ),
                Arguments.of(
                    intArrayOf(1, 3, 5, 6),
                    2,
                    1
                ),
                Arguments.of(
                    intArrayOf(1, 3, 5, 6),
                    7,
                    4
                ),
            )
        }
    }
}