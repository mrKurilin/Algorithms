package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IsAnagramTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(s: String, t: String, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `242 Valid Anagram`().isAnagram(s, t)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "anagram",
                    "nagaram",
                    true,
                ),
                Arguments.of(
                    "rat",
                    "car",
                    false,
                ),
                Arguments.of(
                    "a",
                    "ab",
                    false,
                ),
            )
        }
    }
}