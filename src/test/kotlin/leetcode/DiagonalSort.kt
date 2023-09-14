package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class DiagonalSortTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: Array<IntArray>, expected: Array<IntArray>) {
        Assertions.assertEquals(
            expected.joinToString { it.joinToString() },
            `1329 Sort the Matrix Diagonally`().diagonalSort(args).joinToString { it.joinToString() }
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    arrayOf(
                        intArrayOf(3, 3, 1, 1),
                        intArrayOf(2, 2, 1, 2),
                        intArrayOf(1, 1, 1, 2),
                    ),
                    arrayOf(
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 2, 2, 2),
                        intArrayOf(1, 2, 3, 3),
                    ),
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(11, 25, 66, 1, 69, 7),
                        intArrayOf(23, 55, 17, 45, 15, 52),
                        intArrayOf(75, 31, 36, 44, 58, 8),
                        intArrayOf(22, 27, 33, 25, 68, 4),
                        intArrayOf(84, 28, 14, 11, 5, 50),
                    ),
                    arrayOf(
                        intArrayOf(5, 17, 4, 1, 52, 7),
                        intArrayOf(11, 11, 25, 45, 8, 69),
                        intArrayOf(14, 23, 25, 44, 58, 15),
                        intArrayOf(22, 27, 31, 36, 50, 66),
                        intArrayOf(84, 28, 75, 33, 55, 68),
                    ),
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(11, 25, 66, 1, 69, 7),
                        intArrayOf(23, 55, 17, 45, 15, 52),
                        intArrayOf(75, 31, 36, 44, 58, 8),
                        intArrayOf(22, 27, 33, 25, 68, 4),
                        intArrayOf(84, 28, 14, 11, 5, 50),
                    ),
                    arrayOf(
                        intArrayOf(5, 17, 4, 1, 52, 7),
                        intArrayOf(11, 11, 25, 45, 8, 69),
                        intArrayOf(14, 23, 25, 44, 58, 15),
                        intArrayOf(22, 27, 31, 36, 50, 66),
                        intArrayOf(84, 28, 75, 33, 55, 68),
                    ),
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(75, 21, 13, 24, 8),
                        intArrayOf(24, 100, 40, 49, 62),
                    ),
                    arrayOf(
                        intArrayOf(75, 21, 13, 24, 8),
                        intArrayOf(24, 100, 40, 49, 62),
                    ),
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(3, 9),
                        intArrayOf(2, 4),
                        intArrayOf(1, 2),
                        intArrayOf(9, 8),
                        intArrayOf(7, 3),
                    ),
                    arrayOf(
                        intArrayOf(3, 9),
                        intArrayOf(2, 4),
                        intArrayOf(1, 2),
                        intArrayOf(3, 8),
                        intArrayOf(7, 9),
                    ),
                ),
            )
        }
    }
}