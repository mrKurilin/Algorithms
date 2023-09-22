package leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IsValidBSTTest {

    @ParameterizedTest
    @MethodSource("additionData")
    fun test(args: TreeNode, expected: Boolean) {
        Assertions.assertEquals(
            expected,
            `98 Validate Binary Search Tree`().isValidBST(args)
        )
    }

    companion object {
        @JvmStatic
        fun additionData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    TreeNode(
                        `val` = 2,
                        left = TreeNode(1),
                        right = TreeNode(3)
                    ),
                    true
                ),
                Arguments.of(
                    TreeNode(
                        `val` = 5,
                        left = TreeNode(4),
                        right = TreeNode(
                            `val` = 6,
                            left = TreeNode(3),
                            right = TreeNode(7),
                        )
                    ),
                    false
                ),
            )
        }
    }
}