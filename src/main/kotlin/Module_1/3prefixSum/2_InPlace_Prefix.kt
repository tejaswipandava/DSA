/*
Given an array A of N integers. Construct prefix sum of the array in the given array itself.
 */

class InPlacePrefix {
    fun solve(A: IntArray): IntArray {

        for (i in 1..A.lastIndex) {
            A[i] = A[i] + A[i - 1]
        }

        return A
    }
}
