package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ValidPalindromeTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: String, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `680 Valid Palindrome II`().validPalindrome(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "aba",
                    true
                ),
                Arguments.of(
                    "abca",
                    true
                ),
                Arguments.of(
                    "abc",
                    false
                ),
                Arguments.of(
                    "deeee",
                    true
                ),
                Arguments.of(
                    "eeeed",
                    true
                ),
            )
        }
    }
}