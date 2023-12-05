/*
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
 */
class ColumnSum {
    fun solve(A: Array<IntArray>): IntArray {

        var result = ArrayList<Int>()
        for (col in 0..A[0].lastIndex) {
            var sum = 0
            for (row in 0..A.lastIndex) {
                sum += A[row][col]
            }
            result.add(sum)
        }

        return result.toIntArray()
    }
}
