package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class CheckInclusionTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(s1: String, s2: String, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `567 Permutation in String`().checkInclusion(s1, s2)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "ab",
                    "eidboaoo",
                    false
                ),
                Arguments.of(
                    "ab",
                    "eidbaooo",
                    true
                ),
                Arguments.of(
                    "hello",
                    "ooolleoooleh",
                    false
                ),
                Arguments.of(
                    "ab",
                    "a",
                    false
                ),
                Arguments.of(
                    "ab",
                    "ba",
                    true
                ),
            )
        }
    }
}