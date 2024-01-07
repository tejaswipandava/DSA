/*
You are given the root node of a binary tree A. You have to find the height of the given tree.
A binary tree's height is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

class TreeHeight {
    fun solve(A: TreeNode?): Int {
        return height(A)
    }

    fun height(A: TreeNode?): Int {
        if (A == null) return 0

        return 1 + Math.max(height(A.left), height(A.right))
    }
}