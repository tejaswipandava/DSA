/*
Given a binary tree, return the inorder traversal of its nodes' values.
*/


//Definition for a binary tree node.
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class InOrderTraversal {
    var result = ArrayList<Int>()
    fun inorderTraversal(A: TreeNode?): IntArray {

        inOrder(A)
        return result.toIntArray()
    }

    fun inOrder(A: TreeNode?) {
        if (A == null) return

        inOrder(A.left)
        result.add(A.`val`)
        inOrder(A.right)
        return
    }
}
