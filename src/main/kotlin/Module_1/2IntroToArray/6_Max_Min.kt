/*
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 */
class MaxMin {
    fun solve(A: IntArray): Int {
        var max = A[0]
        var min = A[0]

        for (i in 0..A.lastIndex) {
            if (A[i] > max) max = A[i]
            if (A[i] < min) min = A[i]
        }

        return max - min
    }
}
