package basis

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class BinarySearchTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun <T : Comparable<T>?> test(array: Array<T>,element: T, expected: Int) {
        Assertions.assertEquals(
            expected,
            BinarySearch().binarySearch(array, element)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    arrayOf(1,2,3,4,5),
                    5,
                    4
                ),
                Arguments.of(
                    arrayOf(1,2,3,4,5),
                    4,
                    3
                ),
                Arguments.of(
                    arrayOf(1,2,3,4,5),
                    3,
                    2
                ),
                Arguments.of(
                    arrayOf(1,2,3,4,5),
                    2,
                    1
                ),
                Arguments.of(
                    arrayOf(1,2,3,4,5),
                    1,
                    0
                ),
            )
        }
    }
}