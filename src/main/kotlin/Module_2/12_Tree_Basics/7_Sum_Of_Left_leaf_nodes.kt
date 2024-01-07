class LeftLeafNodes {
    var sum = 0
    fun solve(A: TreeNode?): Int {
        sumLeftLeaf(A)
        return sum
    }

    fun sumLeftLeaf(A: TreeNode?) {
        if (A == null) return
        sumLeftLeaf(A.left)
        sumLeftLeaf(A.right)

        if (A.left != null && A.left!!.left == null && A.left!!.right == null) {
            //println("we are at node ${A.`val`} and we see left as {A.left!!.left?:null} and right as {A.left!!.right?:null}")
            sum += A.left!!.`val`
        }
    }
}
