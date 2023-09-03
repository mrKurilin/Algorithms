package tinkoff.autumn2023

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.stream.Stream

class MineTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(input: String, expectedOutput: String) {
        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        Mine().main()

        Assertions.assertEquals(expectedOutput, outputStream.toString())
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "7 13\n" +
                            "2 3 1\n" +
                            "3 3\n" +
                            "1 2 4\n" +
                            "2 1 1\n" +
                            "3 4\n" +
                            "2 3 4\n" +
                            "1 3 4\n" +
                            "3 4\n" +
                            "1 7 3\n" +
                            "1 1 3\n" +
                            "3 7\n" +
                            "3 1\n" +
                            "2 7 4",
                    "NO\n" +
                            "1\n" +
                            "YES\n" +
                            "2\n" +
                            "NO\n" +
                            "3\n" +
                            "3\n" +
                            "2\n" +
                            "YES\n"
                ),
            )
        }
    }
}