package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class NumIslandsTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: Array<CharArray>, expected: Int) {
        Assertions.assertEquals(
            expected,
            `200 Number of Islands`().numIslands(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    arrayOf(
                        charArrayOf('1', '1', '1', '1', '0'),
                        charArrayOf('1', '1', '0', '1', '0'),
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('0', '0', '0', '0', '0'),
                    ),
                    1
                ),
                Arguments.of(
                    arrayOf(
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('0', '0', '1', '0', '0'),
                        charArrayOf('0', '0', '0', '1', '1'),
                    ),
                    3
                ),
                Arguments.of(
                    arrayOf(
                        charArrayOf('1', '1', '0', '1', '0'),
                        charArrayOf('1', '1', '0', '1', '0'),
                        charArrayOf('1', '1', '1', '1', '0'),
                        charArrayOf('1', '1', '0', '1', '0'),
                    ),
                    1
                ),
                Arguments.of(
                    arrayOf(
                        charArrayOf('1', '0', '1', '0', '1'),
                        charArrayOf('0', '1', '0', '1', '0'),
                        charArrayOf('1', '0', '1', '0', '1'),
                        charArrayOf('0', '1', '0', '1', '0'),
                    ),
                    10
                ),
            )
        }
    }
}