package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.stream.Stream

class ContainerWithMostWaterTest{

    @ParameterizedTest
        @MethodSource("additionData")
        fun test(input: String, expectedOutput: String) {
            val inputStream = ByteArrayInputStream(input.toByteArray())
            System.setIn(inputStream)
            val outputStream = ByteArrayOutputStream()
            System.setOut(PrintStream(outputStream))

        `11 ContainerWithMostWater`().main()

            assertEquals(expectedOutput, outputStream.toString())
        }

        companion object {
            @JvmStatic
            fun additionData(): Stream<Arguments> {
                return Stream.of(
                    Arguments.of(
                        "",
                        ""
                    ),
                )
            }
        }
}