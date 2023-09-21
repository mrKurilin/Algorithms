import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Resource_downloadingKtTest {

    @Test
    fun test1() {
        val input = "8\n" +
                "54578972 99368556\n" +
                "79699669 54578972\n" +
                "64508306 99368556\n" +
                "56554555 64508306\n" +
                "27101564 81480071\n" +
                "89445516 27101564\n" +
                "93762227 81480071\n" +
                "89808815 93762227\n" +
                "4\n" +
                "56554555 2\n" +
                "93762227 79699669\n" +
                "99368556 2\n" +
                "64508306 56554555\n" +
                "27101564 2\n" +
                "99368556 79699669\n" +
                "93762227 2\n" +
                "56554555 54578972"

        val expectedOutput = "1 79699669\n" +
                "2 64508306 56554555\n" +
                "0 \n" +
                "0 \n" +
                ""

        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        ResourceDownloading().main()

        assertEquals(expectedOutput, outputStream.toString())
    }

    @Test
    fun test2() {
        val input = "10\n" +
                "85619126 64616465\n" +
                "98159933 85619126\n" +
                "73978229 85619126\n" +
                "29978081 64616465\n" +
                "72404745 29978081\n" +
                "97698445 75243921\n" +
                "36815728 97698445\n" +
                "18360411 97698445\n" +
                "66445821 75243921\n" +
                "92142380 66445821\n" +
                "4\n" +
                "97698445 4\n" +
                "75243921 92142380 98159933 73978229\n" +
                "66445821 4\n" +
                "29978081 92142380 73978229 97698445\n" +
                "18360411 4\n" +
                "29978081 92142380 98159933 97698445\n" +
                "36815728 4\n" +
                "64616465 92142380 97698445 29978081"

        val expectedOutput = "2 75243921 92142380\n" +
                "2 92142380 97698445\n" +
                "2 92142380 97698445\n" +
                "2 92142380 97698445"


        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        ResourceDownloading().main()

        assertEquals(expectedOutput, outputStream.toString())
    }


}