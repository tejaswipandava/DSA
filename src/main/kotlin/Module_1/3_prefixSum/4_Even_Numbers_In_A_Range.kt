/*
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
Each query consists of two integers B[i][0] and B[i][1].
For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
 */

class EvenNumbersInARange {
    fun solve(A: IntArray, B: Array<IntArray>): IntArray {

        var result = ArrayList<Int>()

        //create an even count prefix
        if (A[0] % 2 == 0) A[0] = 1 else A[0] = 0
        for (i in 1..A.lastIndex) {
            if (A[i] % 2 == 0) A[i] = A[i - 1] + 1
            else {
                A[i] = A[i - 1]
            }
        }

        for ((l, r) in B) {
            if (l == 0) result.add(A[r])
            else result.add(A[r] - A[l - 1])
        }

        return result.toIntArray()
    }
}
