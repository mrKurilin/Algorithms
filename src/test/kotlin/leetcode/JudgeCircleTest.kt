package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class JudgeCircleTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: String, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `657 Robot Return to Origin`().judgeCircle(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "UD",
                    true
                ),
                Arguments.of(
                    "LL",
                    false
                ),
            )
        }
    }
}