/*
Given an array, arr[] of size N, the task is to find the count of array indices such that
removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 */
class SpecialIndex {
    fun solve(A: IntArray): Int {

        var evenIndex = IntArray(A.size) { 0 }
        var oddIndex = IntArray(A.size) { 0 }

        evenIndex[0] = A[0]
        for (i in 1..A.lastIndex) {
            if (i % 2 == 0) {
                evenIndex[i] = A[i] + evenIndex[i - 1]
                oddIndex[i] = oddIndex[i - 1]
            } else {
                evenIndex[i] = evenIndex[i - 1]
                oddIndex[i] = A[i] + oddIndex[i - 1]
            }
        }

        var even = 0
        var odd = 0
        var result = 0
        var n = A.lastIndex

        for (i in 0..A.lastIndex) {
            if (i == 0) {
                even = evenIndex[n] - evenIndex[0]
                odd = oddIndex[n] - oddIndex[0]
            } else if (i == n) {
                even = evenIndex[n - 1]
                odd = oddIndex[n - 1]
            } else {
                even = evenIndex[i - 1] + oddIndex[n] - oddIndex[i]
                odd = oddIndex[i - 1] + evenIndex[n] - evenIndex[i]
            }

            if (even == odd) result++
        }

        return result

    }
}
