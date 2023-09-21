import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class WoodsTest {

    private val woods = Woods()

    @Test
    fun test1() {
        val input = "1 2\n" +
                "3 4"
        val expectedOutput = "7"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        woods.main()

        assertEquals(expectedOutput, outputStream.toString())
    }


    @Test
    fun test2() {
        val input = "2 3\n" +
                "4 5 8"
        val expectedOutput = "8"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        woods.main()

        assertEquals(expectedOutput, outputStream.toString())
    }


    @Test
    fun test3() {
        val input = "2 11\n" +
                "1 1 1 1 1 1 1 1 1 1 9"
        val expectedOutput = "9"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        woods.main()

        assertEquals(expectedOutput, outputStream.toString())
    }
}