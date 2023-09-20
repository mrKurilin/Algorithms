package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MissingNumberTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: IntArray, expected: Int) {
        Assertions.assertEquals(
            expected,
            `268 Missing Number`().missingNumber(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(3, 0, 1),
                    2
                ),
                Arguments.of(
                    intArrayOf(0, 1),
                    2
                ),
                Arguments.of(
                    intArrayOf(9,6,4,2,3,5,7,0,1),
                    8
                ),

            )
        }
    }
}