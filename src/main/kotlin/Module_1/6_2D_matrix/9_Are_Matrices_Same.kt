/*
You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.

NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.
 */

class AreMatricesSame {
    fun solve(A: Array<IntArray>, B: Array<IntArray>): Int {

        for (row in 0..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                if (A[row][col] != B[row][col]) return 0
            }
        }

        return 1
    }
}
