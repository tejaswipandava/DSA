/*
You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
 */

class MinorDiagonalSum {
    fun solve(A: Array<IntArray>): Int {

        var sum = 0
        var row = 0
        var col = A.lastIndex
        while (row <= A.lastIndex && col >= 0) {
            sum += A[row][col]
            row++
            col--
        }

        return sum
    }
}

