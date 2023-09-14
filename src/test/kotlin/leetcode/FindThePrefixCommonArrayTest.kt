package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FindThePrefixCommonArrayTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(a: IntArray, b: IntArray, expected: IntArray) {
        Assertions.assertEquals(
            expected.joinToString(),
            `2657 Find the Prefix Common Array of Two Arrays`().findThePrefixCommonArray(a, b).joinToString()
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(1, 3, 2, 4),
                    intArrayOf(3, 1, 2, 4),
                    intArrayOf(0, 2, 3, 4),
                ),
                Arguments.of(
                    intArrayOf(2, 3, 1),
                    intArrayOf(3, 1, 2),
                    intArrayOf(0, 1, 3),
                ),
            )
        }
    }
}