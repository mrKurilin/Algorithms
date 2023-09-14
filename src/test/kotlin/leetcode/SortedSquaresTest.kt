package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SortedSquaresTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: IntArray, expected: IntArray) {
        Assertions.assertEquals(
            expected,
            `977 Squares of a Sorted Array`().sortedSquares(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(-4, -1, 0, 3, 10),
                    intArrayOf(0, 1, 9, 16, 100),
                ),
                Arguments.of(
                    intArrayOf(-7, -3, 2, 3, 11),
                    intArrayOf(4, 9, 9, 49, 121),
                ),
            )
        }
    }
}