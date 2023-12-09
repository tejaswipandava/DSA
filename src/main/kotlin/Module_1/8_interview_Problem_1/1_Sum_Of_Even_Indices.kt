/*
You are given an array A of length N and Q queries given by the 2D array B of size Q*2.
Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing
 */

class SumOfEvenIndices {
    fun solve(A: IntArray, B: Array<IntArray>): IntArray {


        for (i in 1..A.lastIndex) {
            if (i % 2 == 0) {
                A[i] += A[i - 1]
            } else {
                A[i] = A[i - 1]
            }
        }

        var result = ArrayList<Int>()

        for ((l, r) in B) {
            if (l == 0) result.add(A[r])
            else {
                result.add(A[r] - A[l - 1])
            }
        }

        return result.toIntArray()
    }
}
