/*
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
 */

class MatrixScalarProduct {
    fun solve(A: Array<IntArray>, B: Int): Array<IntArray> {

        for (row in 0..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                A[row][col] = B * A[row][col]
            }
        }

        return A
    }
}
