/*
Given a 2D integer array A, return the transpose of A.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 */
class MatrixTranspose {
    fun solve(A: Array<IntArray>): Array<IntArray> {

        var matrix = Array(A[0].size) { IntArray(A.size) { 0 } }

        for (row in 0..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                matrix[col][row] = A[row][col]
            }
        }

        return matrix
    }
}
