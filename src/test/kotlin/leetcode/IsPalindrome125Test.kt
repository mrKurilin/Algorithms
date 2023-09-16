package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IsPalindrome125Test {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: String, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `125 Valid Palindrome`().isPalindrome(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "A man, a plan, a canal: Panama",
                    true
                ),
                Arguments.of(
                    "race a car",
                    false
                ),
                Arguments.of(
                    " ",
                    true
                ),
            )
        }
    }
}