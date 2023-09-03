package tinkoff.autumn2023

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.stream.Stream

class ChogenTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(input: String, expectedOutput: String) {
        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        Chogen().main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "2 2 \n" +
                            "1 2 6 \n" +
                            "2 1 9",
                    "8"
                ),
                Arguments.of(
                    "5 6 \n" +
                            "1 2 8 \n" +
                            "2 3 6 \n" +
                            "2 3 2 \n" +
                            "3 1 4 \n" +
                            "5 4 1 \n" +
                            "4 5 8 ",
                    "5"
                ),

            )
        }
    }
}