package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class RestoreIpAddressesTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: String, expected: List<String>) {
        Assertions.assertEquals(
            expected.toSet(),
            `93 Restore IP Addresses`().restoreIpAddresses(args).toSet()
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "25525511135",
                    listOf("255.255.111.35", "255.255.11.135")
                ),
                Arguments.of(
                    "0000",
                    listOf("0.0.0.0")
                ),
                Arguments.of(
                    "101023",
                    listOf("1.0.102.3", "1.0.10.23", "10.10.2.3", "10.1.0.23", "101.0.2.3")
                ),
                Arguments.of(
                    "1",
                    listOf<String>()
                ),
            )
        }
    }
}