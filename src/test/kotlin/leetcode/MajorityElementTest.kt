package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MajorityElementTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: IntArray, expected: Int) {
        Assertions.assertEquals(
            expected,
            `169 Majority Element`().majorityElement(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(3, 2, 3),
                    3
                ),
                Arguments.of(
                    intArrayOf(2, 2, 1, 1, 1, 2, 2),
                    2
                ),
                Arguments.of(
                    intArrayOf(6,5,5),
                    5
                ),
            )
        }
    }
}