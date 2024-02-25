/*
Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1,
such that the sum of all the elements in the submatrix is maximum.

Maximum sum 3 x 3 matrix is
8 6 7
4 4 4
5 5 5
Sum = 48
 */
fun main() {

    val matrix = arrayOf(
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(2, 2, 2, 2, 2),
        intArrayOf(3, 8, 6, 7, 3),
        intArrayOf(4, 4, 4, 4, 4),
        intArrayOf(5, 5, 5, 5, 5)
    )

    MaximumSumSquareSubMatrix().solve(matrix, 3)
}

class MaximumSumSquareSubMatrix {
    fun solve(A: Array<IntArray>, B: Int): Int {
        var result = 0
        prefixMatrix(A)

        for (row in B - 1..A.lastIndex) {
            for (col in B - 1..A[0].lastIndex) {
                var r1 = row - (B - 1)
                var c1 = col - (B - 1)
                var sum = matrixSum(A, r1, c1, row, col)
                result = Math.max(result, sum)
            }
        }

        return result
    }

    fun matrixSum(A: Array<IntArray>, r1: Int, c1: Int, r2: Int, c2: Int): Int {
        if (r1 == 0 && c1 == 0) return A[r2][c2]
        if (r1 == 0 && c1 != 0) return A[r2][c2] - A[r2][c1 - 1]
        if (r1 != 0 && c1 == 0) return A[r2][c2] - A[r1 - 1][c2]
        else return A[r2][c2] - A[r2][c1 - 1] - A[r1 - 1][c2] + A[r1 - 1][c1 - 1]
    }

    fun prefixMatrix(A: Array<IntArray>) {
        for (row in 1..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                A[row][col] += A[row - 1][col]
            }
        }

        for (row in 0..A.lastIndex) {
            for (col in 1..A[0].lastIndex) {
                A[row][col] += A[row][col - 1]
            }
        }
    }
}
