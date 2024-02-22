/*
Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
A = [ [1, 2]
      [3, 4] ]

The submatrices are [1], [2], [3], [4], [1, 2], [3, 4], [1, 3], [2, 4] and [[1, 2], [3, 4]].
Total sum = 40
 */
class SumOfAllMatrices {
    fun solve(A: Array<IntArray>): Int {
        return contributionTechnique(A)
    }

    fun contributionTechnique(A: Array<IntArray>): Int {
        //contribution techniques says for oneD (n-i)(i+1)A[i]
        //for matrix (n-row)(row+1)(m-col)(col+1)A[row][col]

        var sum = 0
        var n = A.size
        var m = A[0].size

        for (row in 0..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                sum += (n - row) * (row + 1) * (m - col) * (col + 1) * (A[row][col])
            }
        }

        return sum
    }
}
