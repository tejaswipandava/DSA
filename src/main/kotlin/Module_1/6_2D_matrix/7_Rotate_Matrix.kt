/*
You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.
 */

class RotateMatrix {
    fun solve(A: Array<IntArray>) {

        //transpose
        for (row in 0..A.lastIndex) {
            for (col in 0..row) {
                var temp = A[row][col]
                A[row][col] = A[col][row]
                A[col][row] = temp
            }
        }

        //mirror
        for (row in 0..A.lastIndex) {
            for (col in 0..A.lastIndex / 2) {
                var temp = A[row][col]
                A[row][col] = A[row][A.lastIndex - col]
                A[row][A.lastIndex - col] = temp
            }
        }
    }
}
