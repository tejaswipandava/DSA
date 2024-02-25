/*
Given a row-wise and column-wise sorted matrix A of size N * M.
Return the maximum non-empty submatrix sum of this matrix.

    -5 -4 -3
A = -1  2  3
     2  2  4

The submatrix with max sum is
-1 2 3
 2 2 4
 Sum is 12.
 */

class MaximumSubMatrixSum {
    fun solve(A: Array<IntArray>): Long {
        return suffixMatrix(A)
    }

    fun suffixMatrix(A: Array<IntArray>): Long {
        var arr = A.map { row -> row.map { it.toLong() }.toLongArray() }.toTypedArray()

        for (row in arr.lastIndex - 1 downTo 0) {
            for (col in arr[0].lastIndex downTo 0) {
                arr[row][col] += arr[row + 1][col]
            }
        }

        for (row in arr.lastIndex downTo 0) {
            for (col in arr[0].lastIndex - 1 downTo 0) {
                arr[row][col] += arr[row][col + 1]
            }
        }

        var max = Long.MIN_VALUE
        for (row in arr.lastIndex downTo 0) {
            for (col in arr[0].lastIndex downTo 0) {
                max = Math.max(max, arr[row][col])
            }
        }

        return max
    }
}

