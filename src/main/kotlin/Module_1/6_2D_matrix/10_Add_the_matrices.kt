/*
You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
 */


class AddTheMatrices {
    fun solve(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {

        var result = Array<IntArray>(A.size) { IntArray(A[0].size) { 0 } }

        for (i in 0..result.lastIndex) {
            for (j in 0..result[0].lastIndex)
                result[i][j] = A[i][j] + B[i][j]
        }

        return result
    }

    fun solve1(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {

        for (row in 0..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                A[row][col] = A[row][col] + B[row][col]
            }
        }

        return A
    }
}

