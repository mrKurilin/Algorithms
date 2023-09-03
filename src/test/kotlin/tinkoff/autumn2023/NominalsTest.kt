package tinkoff.autumn2023

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.stream.Stream

class NominalsTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(input: String, expectedOutput: String) {
        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        Nominals().main()

        Assertions.assertEquals(expectedOutput, outputStream.toString())
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "5 2 \n" +
                            "1 2",
                    "3\n" +
                            "1 2 2"
                ),
                Arguments.of(
                    "7 2\n" +
                            "1 2",
                    "-1"
                ),
                Arguments.of(
                    "5 2 \n" +
                            "3 4",
                    "-1"
                ),

            )
        }
    }
}