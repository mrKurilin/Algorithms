package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MaxDistToClosestTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: IntArray, expected: Int) {
        Assertions.assertEquals(
            expected,
            `849 Maximize Distance to Closest Person`().maxDistToClosest(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(1, 0, 0, 0, 1, 0, 1),
                    2
                ),
                Arguments.of(
                    intArrayOf(1, 0, 0, 0),
                    3
                ),
                Arguments.of(
                    intArrayOf(0, 1),
                    1
                ),
                Arguments.of(
                    intArrayOf(1, 0, 0, 1),
                    1
                ),
            )
        }
    }
}