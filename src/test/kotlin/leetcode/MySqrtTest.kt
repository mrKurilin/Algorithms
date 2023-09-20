package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MySqrtTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args:Int, expected: Int) {
        Assertions.assertEquals(
            expected,
            `69 Sqrt(x)`().mySqrt(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(4, 2),
                Arguments.of(8, 2),
                Arguments.of(48, 6),
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 1),
            )
        }
    }
}