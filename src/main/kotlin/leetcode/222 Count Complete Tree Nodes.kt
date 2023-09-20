package leetcode

class `222 Count Complete Tree Nodes` {

    fun countNodes(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else {
            1 + countNodes(root.left) + countNodes(root.right)
        }
    }
}