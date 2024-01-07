class CountNodes {
    fun solve(A: TreeNode?): Int {
        return countNodes(A)
    }

    fun countNodes(A: TreeNode?): Int {
        if (A == null) return 0

        var left = countNodes(A.left)
        var right = countNodes(A.right)
        return 1 + left + right
    }
}
