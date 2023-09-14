package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FindClosestElementsTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: FindClosestElementsArgs, expected: List<Int>) {
        Assertions.assertEquals(
            expected,
            `658 Find K Closest Elements`().findClosestElements(
                args.arr,
                args.k,
                args.x,
            )
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    FindClosestElementsArgs(
                        arr = intArrayOf(1, 2, 3, 4, 5),
                        k = 4,
                        x = 3
                    ),
                    listOf(1, 2, 3, 4)
                ),
                Arguments.of(
                    FindClosestElementsArgs(
                        arr = intArrayOf(1, 2, 3, 4, 5),
                        k = 4,
                        x = -1
                    ),
                    listOf(1, 2, 3, 4)
                ),
            )
        }
    }
}

class FindClosestElementsArgs(
    val arr: IntArray,
    val k: Int,
    val x: Int
)