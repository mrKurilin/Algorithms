package tinkoff.autumn2023

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.stream.Stream

class SheriffTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(input: String, expectedOutput: String) {
        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        Sheriff().main()

        Assertions.assertEquals(expectedOutput, outputStream.toString())
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "fheriherffazfszkisrrs",
                    "2"
                ),
                Arguments.of(
                    "rifftratatashe",
                    "1"
                ),
                Arguments.of(
                    "thegorillaiswatching",
                    "0"
                ),

            )
        }
    }
}