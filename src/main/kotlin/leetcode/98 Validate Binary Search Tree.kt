package leetcode

class `98 Validate Binary Search Tree` {

    fun isValidBST(root: TreeNode?): Boolean {

        if (root == null) {
            return true
        }

        if (root.left != null && root.left!!.`val` >= root.`val`) {
            return false
        }

        if (root.right != null && root.right!!.`val` <= root.`val`) {
            return false
        }

        return isValidBST(root.left) && isValidBST(root.right) && isValidLeftBST(
            root.left,
            root.`val`
        ) && isValidRightBST(root.right, root.`val`)
    }

    fun isValidLeftBST(root: TreeNode?, int: Int): Boolean {
        if (root == null) return true
        if (root.`val` >= int) return false
        return isValidLeftBST(root.right, int)
    }

    fun isValidRightBST(root: TreeNode?, int: Int): Boolean {
        if (root == null) return true
        if (root.`val` <= int) return false
        return isValidRightBST(root.left, int)
    }
}