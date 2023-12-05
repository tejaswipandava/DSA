/*
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
Specifically, make entire ith row and jth column zero.
 */
class RowToColumnZero {
    fun solve(A: Array<IntArray>): Array<IntArray> {

        for (row in 0..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                if (A[row][col] == 0) {
                    rowZero(A, row)
                    break
                }
            }
        }

        for (col in 0..A[0].lastIndex) {
            for (row in 0..A.lastIndex) {
                if (A[row][col] == -1) {
                    colZero(A, col)
                    break
                }
            }
        }

        return A
    }

    fun rowZero(A: Array<IntArray>, row: Int) {
        for (col in 0..A[0].lastIndex) {
            if (A[row][col] == 0) A[row][col] = -1 else A[row][col] = 0
        }
    }

    fun colZero(A: Array<IntArray>, col: Int) {
        for (row in 0..A.lastIndex) {
            A[row][col] = 0
        }
    }

    fun extraSpace(A: Array<IntArray>): Array<IntArray> {

        var m = A.size
        var n = A[0].size

        var row = IntArray(m)
        var col = IntArray(n)


        for (i in 0..A.lastIndex) {
            for (j in 0..A[0].lastIndex) {
                if (A[i][j] == 0) {
                    row[i] = 1
                    col[j] = 1
                }
            }
        }

        for (i in 0..A.lastIndex) {
            for (j in 0..A[0].lastIndex) {
                if (row[i] == 1 || col[j] == 1) {
                    A[i][j] = 0
                }
            }
        }

        return A

    }
}
