class SumOfNodesOfBinaryTree {
    var result = 0
    fun solve(A: TreeNode?): Int {
        return sum(A)
    }

    fun sum(A: TreeNode?): Int {
        if (A == null) return 0
        return A.`val` + sum(A.left) + sum(A.right)
    }
}