/*
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.
 */
class ClosestMinMax {
    fun solve(A: IntArray): Int {

        var max = A[0]
        var min = A[0]

        for (i in 1..A.lastIndex) {
            if (A[i] > max) max = A[i]
            if (A[i] < min) min = A[i]
        }

        var maxIndex = -1
        var minIndex = -1
        var result = A.size
        for (i in 0..A.lastIndex) {
            if (A[i] == max) {
                maxIndex = i
            }
            if (A[i] == min) {
                minIndex = i
            }

            if (maxIndex != -1 && minIndex != -1) {
                result = Math.min(result, Math.abs(maxIndex - minIndex) + 1)
            }
        }

        return result
    }
}
