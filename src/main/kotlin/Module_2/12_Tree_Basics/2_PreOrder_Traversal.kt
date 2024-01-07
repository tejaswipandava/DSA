class PreOrderTraversal {
    var result = ArrayList<Int>()
    fun preorderTraversal(A: TreeNode?): IntArray {
        preOrder(A)
        return result.toIntArray()
    }

    fun preOrder(A: TreeNode?) {
        if (A == null) return

        result.add(A.`val`)
        preOrder(A.left)
        preOrder(A.right)
        return
    }
}