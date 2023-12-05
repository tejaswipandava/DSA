/*
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
 */


class MainDiagonalSum {
    fun solve(A: Array<IntArray>): Int {

        var sum = 0

        for (row in 0..A.lastIndex) {
            sum += A[row][row]
        }

        return sum

    }
}
