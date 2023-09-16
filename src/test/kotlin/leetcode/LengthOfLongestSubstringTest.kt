package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class LengthOfLongestSubstringTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args:String, expected: Int) {
        Assertions.assertEquals(
            expected,
            `3 Longest Substring Without Repeating Characters`().lengthOfLongestSubstring(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "abcabcbb",
                    3
                ),
                Arguments.of(
                    "bbbbb",
                    1
                ),
                Arguments.of(
                    "pwwkew",
                    3
                ),
                Arguments.of(
                    "",
                    0
                ),
                Arguments.of(
                    " ",
                    1
                ),
            )
        }
    }
}