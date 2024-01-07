class PostOrderTraversal {
    var result = ArrayList<Int>()
    fun postorderTraversal(A: TreeNode?): IntArray {
        postOrder(A)
        return result.toIntArray()
    }

    fun postOrder(A: TreeNode?) {
        if (A == null) return

        postOrder(A.left)
        postOrder(A.right)
        result.add(A.`val`)
        return
    }
}