package tinkoff.autumn2023

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.stream.Stream

class WinCardsTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(input: String, expectedOutput: String) {
        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        WinCards().main()

        Assertions.assertEquals(expectedOutput, outputStream.toString().replace("\r\n", "\n"))
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "5\n" +
                            "1 4 2 2 4\n" +
                            "1 4 4 2 2",
                    "NO"
                ),
                Arguments.of(
                    "6\n" +
                            "5 1 2 5 3 5\n" +
                            "5 1 2 3 5 5",
                    "YES"
                ),
                Arguments.of(
                    "3\n" +
                            "4 1 2\n" +
                            "1 4 7",
                    "NO"
                ),
                Arguments.of(
                    "1\n" +
                            "7\n" +
                            "7",
                    "YES"
                ),
                Arguments.of(
                    "7\n" +
                            "4 4 1 7 5 3 8\n" +
                            "4 1 4 5 7 3 8",
                    "YES"
                ),
            )
        }
    }
}