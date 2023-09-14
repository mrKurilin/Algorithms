package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SummaryRangesTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: IntArray, expected: List<String>) {
        Assertions.assertEquals(
            expected,
            `228 Summary Ranges`().summaryRanges(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(0, 1, 2, 4, 5, 7),
                    listOf("0->2", "4->5", "7")
                ),
                Arguments.of(
                    intArrayOf(0, 2, 3, 4, 6, 8, 9),
                    listOf("0", "2->4", "6", "8->9")
                ),
            )
        }
    }
}