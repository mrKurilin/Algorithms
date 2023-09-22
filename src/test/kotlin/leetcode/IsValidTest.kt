package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IsValidTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: String, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `20 Valid Parentheses`().isValid(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "()",
                    true
                ),
                Arguments.of(
                    "()[]{}",
                    true
                ),
                Arguments.of(
                    "(]",
                    false
                ),
            )
        }
    }
}