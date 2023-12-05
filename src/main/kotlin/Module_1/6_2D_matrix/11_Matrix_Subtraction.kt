/*
You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M).
You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions).
Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
 */

class MatrixSubtraction {
    fun solve(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {

        for (row in 0..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                A[row][col] -= B[row][col]
            }
        }

        return A
    }
}
