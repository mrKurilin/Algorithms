package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class TopKFrequentTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: TopKFrequentArgs, expected: List<String>) {
        Assertions.assertEquals(
            expected.joinToString(),
            `692 Top K Frequent Words`().topKFrequent(args.words, args.k).joinToString()
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    TopKFrequentArgs(
                        words = arrayOf("i", "love", "leetcode", "i", "love", "coding"),
                        k = 2
                    ),
                    listOf("i", "love")
                ),
                Arguments.of(
                    TopKFrequentArgs(
                        words = arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"),
                        k = 4
                    ),
                    listOf("the", "is", "sunny", "day")
                ),
                Arguments.of(
                    TopKFrequentArgs(
                        words = arrayOf("i","love","leetcode","i","love","coding"),
                        k = 1
                    ),
                    listOf("i")
                ),
            )
        }
    }
}

class TopKFrequentArgs(
    val words: Array<String>,
    val k: Int
)