package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IsIsomorphicTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(s: String, t: String, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `205 Isomorphic Strings`().isIsomorphic(s, t)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "egg",
                    "add",
                    true
                ),
                Arguments.of(
                    "foo",
                    "bar",
                    false
                ),
                Arguments.of(
                    "paper",
                    "title",
                    true
                ),
                Arguments.of(
                    "13",
                    "42",
                    true
                ),
                Arguments.of(
                    "qwertyuiop[]asdfghjkl;'\\zxcvbnm,./",
                    "',.pyfgcrl/=aoeuidhtns-\\;qjkxbmwvz",
                    true
                ),
                Arguments.of(
                    "abcdefghijklmnopqrstuvwxyzva",
                    "abcdefghijklmnopqrstuvwxyzck",
                    false
                ),
            )
        }
    }
}