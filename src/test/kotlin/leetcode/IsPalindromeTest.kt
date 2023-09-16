package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IsPalindromeTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: ListNode, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `234 Palindrome Linked List`().isPalindrome(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    ListNode(1, ListNode(2, ListNode(2, ListNode(1)))),
                    true
                ),
                Arguments.of(
                    ListNode(1, ListNode(2, ListNode(2, ListNode(1)))),
                    true
                ),
                Arguments.of(
                    ListNode(1, ListNode(2)),
                    false
                ),
            )
        }
    }
}