package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class RemoveElementTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(nums: IntArray, `val`: Int, expected: Int) {
        Assertions.assertEquals(
            expected,
            `27 Remove Element`().removeElement(nums, `val`)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(3, 2, 2, 3),
                    3,
                    2
                ),
                Arguments.of(
                    intArrayOf(0, 1, 2, 2, 3, 0, 4, 2),
                    2,
                    5
                ),
            )
        }
    }
}