package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MoveZeroesTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: IntArray, expected: IntArray) {
        `283 Move Zeroes`().moveZeroes(args)
        Assertions.assertEquals(
            expected.joinToString(),
            args.joinToString()
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(0, 1, 0, 3, 12),
                    intArrayOf(1, 3, 12, 0, 0),
                ),
                Arguments.of(
                    intArrayOf(0),
                    intArrayOf(0),
                ),
            )
        }
    }
}