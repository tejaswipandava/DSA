/*
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
 */

class SecondLargest {
    fun solve(A: IntArray): Int {

        var max1 = -1
        var max2 = -1

        for (i in 0..A.lastIndex) {
            if (A[i] > max1) {
                max2 = max1
                max1 = A[i]
            } else if (A[i] > max2 && A[i] != max1) {
                max2 = A[i]
            }
        }

        return if (max1 != max2) max2 else -1
    }
}
