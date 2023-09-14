package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class CompressTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: CharArray, expected: Int) {
        Assertions.assertEquals(
            expected,
            `443 String Compression`().compress(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c'),
                    6
                ),
                Arguments.of(
                    charArrayOf('a'),
                    1
                ),
                Arguments.of(
                    charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'),
                    4
                ),
                Arguments.of(
                    charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'),
                    4
                ),
            )
        }
    }
}