package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IntersectTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(nums1: IntArray, nums2: IntArray, expected: IntArray) {
        Assertions.assertEquals(
            expected.joinToString(),
            `350 Intersection of Two Arrays II`().intersect(nums1, nums2).joinToString()
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(1, 2, 2, 1),
                    intArrayOf(2, 2),
                    intArrayOf(2, 2),
                ),
                Arguments.of(
                    intArrayOf(4, 9, 5),
                    intArrayOf(9, 4, 9, 8, 4),
                    intArrayOf(4, 9),
                ),
            )
        }
    }
}