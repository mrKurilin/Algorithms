package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class PartitionLabelsTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: String, expected: List<Int>) {
        Assertions.assertEquals(
            expected,
            `763 Partition Labels`().partitionLabels(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "ababcbacadefegdehijhklij",
                    listOf(9, 7, 8)
                ),
                Arguments.of(
                    "eccbbbbdec",
                    listOf(10)
                ),
                Arguments.of(
                    "abc",
                    listOf(1, 1, 1)
                ),
            )
        }
    }
}