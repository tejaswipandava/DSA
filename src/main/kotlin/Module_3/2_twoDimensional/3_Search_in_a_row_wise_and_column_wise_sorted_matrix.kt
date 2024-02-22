/*
Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
Note 3: Expected time complexity is linear
Note 4: Use 1-based indexing
*/

class Searchinarowwiseandcolumnwisesortedmatrix {
    fun solve(A: Array<IntArray>, B: Int): Int {
        return nonDecreaseSearch(A, B)
    }

    fun nonDecreaseSearch(A: Array<IntArray>, B: Int): Int {
        var row = 0
        var col = A[0].lastIndex
        var n = A.lastIndex
        var m = A[0].size

        var result = Int.MAX_VALUE

        while (row <= n && col >= 0) {
            if (A[row][col] > B) {
                col--
            } else if (A[row][col] < B) {
                row++
            } else {
                result = Math.min((row + 1) * (1009) + col, result)
                col--
            }
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }
}
