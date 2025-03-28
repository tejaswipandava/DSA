/*
Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom, and columns are numbered from left to right.
The sum may be large, so return the answer mod 109 + 7.
Also, select the data type carefully, if you want to store the addition of some elements.
Indexing given in B, C, D, and E arrays is 1-based.
Top Left 0-based index = (B[i] - 1, C[i] - 1)
Bottom Right 0-based index = (D[i] - 1, E[i] - 1)

Input Format
The first argument given is the integer matrix A.
The second argument given is the integer array B.
The third argument given is the integer array C.
The fourth argument given is the integer array D.
The fifth argument given is the integer array E.
(B[i], C[i]) represents the top left corner of the i'th query.
(D[i], E[i]) represents the bottom right corner of the i'th query.

 A = [   [1, 2, 3]
         [4, 5, 6]
         [7, 8, 9]   ]
 B = [1, 2]
 C = [1, 2]
 D = [2, 3]
 E = [2, 3]

 output =  [12, 28]

 For query 1: Submatrix contains elements: 1, 2, 4 and 5. So, their sum is 12.
 For query 2: Submatrix contains elements: 5, 6, 8 and 9. So, their sum is 28.
 */


class SubmatrixSumQueries {

    fun subMatrixSumQueries(A: Array<IntArray>, B: IntArray, C: IntArray, D: IntArray, E: IntArray): IntArray {
        var result = ArrayList<Int>()

        var mod = (Math.pow(10.0, 9.0) + 7).toInt()
        preFixMatrix(A)
        for (i in 0..B.lastIndex) {
            var sum = 0
            var r1 = B[i] - 1
            var c1 = C[i] - 1
            var r2 = D[i] - 1
            var c2 = E[i] - 1

            var bottomRight = A[r2][c2]
            var bottomLeft = if (c1 != 0) -A[r2][c1 - 1] else 0
            var topright = if (r1 != 0) -A[r1 - 1][c2] else 0
            var topleft = if (r1 != 0 && c1 != 0) A[r1 - 1][c1 - 1] else 0

            sum = bottomLeft + bottomRight + topleft + topright

            while (sum < 0) sum += mod
            sum = sum % mod

            result.add(sum)
        }

        return result.toIntArray()
    }

    fun solve(A: Array<IntArray>, B: IntArray, C: IntArray, D: IntArray, E: IntArray): IntArray {

        var result = ArrayList<Int>()

        preFixMatrix(A)
        var mod = (Math.pow(10.0, 9.0) + 7).toInt()

        for (i in 0..B.lastIndex) {
            var r1 = B[i] - 1
            var c1 = C[i] - 1
            var r2 = D[i] - 1
            var c2 = E[i] - 1

            var sum = 0

            if (r1 == 0 && c1 == 0) sum = A[r2][c2]
            else if (r1 == 0 && c1 != 0) sum = A[r2][c2] - A[r2][c1 - 1]
            else if (r1 != 0 && c1 == 0) sum = A[r2][c2] - A[r1 - 1][c2]
            else sum = A[r2][c2] - A[r1 - 1][c2] - A[r2][c1 - 1] + A[r1 - 1][c1 - 1]

            while (sum < 0) sum += mod
            sum = sum % mod
            result.add(sum)
        }

        return result.toIntArray()

    }

    fun preFixMatrix(A: Array<IntArray>) {

        var mod = (Math.pow(10.0, 9.0) + 7).toInt()
        //var F = A.map { it.map { value -> value.toLong() }.toLongArray() }.toTypedArray()

        //vertical or row sum
        for (row in 1..A.lastIndex) {
            for (col in 0..A[0].lastIndex) {
                A[row][col] += (A[row - 1][col]) % mod
                A[row][col] = A[row][col] % mod
            }
        }

        //horizontal or column sum
        for (row in 0..A.lastIndex) {
            for (col in 1..A[0].lastIndex) {
                A[row][col] += (A[row][col - 1]) % mod
                A[row][col] = A[row][col] % mod
            }
        }
    }
}
