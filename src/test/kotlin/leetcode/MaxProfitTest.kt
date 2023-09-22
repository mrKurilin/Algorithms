package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MaxProfitTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: IntArray, expected: Int) {
        Assertions.assertEquals(
            expected,
            `121 Best Time to Buy and Sell Stock`().maxProfit(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(7, 1, 5, 3, 6, 4),
                    5
                ),
                Arguments.of(
                    intArrayOf(7, 6, 4, 3, 1),
                    0
                ),
                Arguments.of(
                    intArrayOf(2, 4, 1),
                    2
                ),
            )
        }
    }
}