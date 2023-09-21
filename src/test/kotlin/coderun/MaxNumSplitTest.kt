import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MaxNumSplitTest {

    private val maxNumSplit = MaxNumSplit()

    @Test
    fun test1() {
        val input = "0"
        val expectedOutput = "0"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test2() {
        val input = "101"
        val expectedOutput = "10-1"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test3() {
        val input = "102"
        val expectedOutput = "1-0-2"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test4() {
        val input = "11"
        val expectedOutput = "11"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test5() {
        val input = "111"
        val expectedOutput = "1-11"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test6() {
        val input = "1000000"
        val expectedOutput = "100000-0"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test7() {
        val input = "100100"
        val expectedOutput = "10-0-100"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test8() {
        val input = "24244"
        val expectedOutput = "2-4-244"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test9() {
        val input = "100100100"
        val expectedOutput = "10-0-100100"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test10() {
        val input = "1000001"
        val expectedOutput = "10000-0-1"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test11() {
        val input = "101010"
        val expectedOutput = "1-0-1010"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test12() {
        val input = "777777"
        val expectedOutput = "7-777-77"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test14() {
        val input = "11000001"
        val expectedOutput = "110000-0-1"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test15() {
        val input = "4400044"
        val expectedOutput = "4-400-0-44"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test16() {
        val input = "321123"
        val expectedOutput = "3-2-1-123"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test17() {
        val input = "4000400"
        val expectedOutput = "4000-40-0"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test18() {
        val input = "400040040"
        val expectedOutput = "4000-400-4-0"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test19() {
        val input = "25522552"
        val expectedOutput = "2-5-52-2552"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test20() {
        val input = "400400400"
        val expectedOutput = "40-0-400400"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test21() {
        val input = "401402403"
        val expectedOutput = "4-0-1-40-2-403"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test22() {
        val input = "123456789"
        val expectedOutput = "1-2-3-4-5-6-7-8-9"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test23() {
        val input = "1"
        val expectedOutput = "1"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test24() {
        val input = "10000000000000000000"
        val expectedOutput = "1000000000000000000-0"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test25() {
        val input = "1000100101"
        val expectedOutput = "100-0-10010-1"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }

     @Test
    fun test26() {
        val input = "50005000500500"
        val expectedOutput = "500-0-5000-500500"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        maxNumSplit.main()

        assertEquals(expectedOutput, outputStream.toString())
    }


}