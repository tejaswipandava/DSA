/*
You are given an integer array A.
Decide whether it is possible to divide the array into one or more subarrays of even length
such that the first and last element of all subarrays will be even.

Return "YES" if it is possible; otherwise, return "NO" (without quotes).
 */
class EvenSubArray {
    fun solve(A: IntArray): String {

        if (A.size % 2 != 0) return "NO"

        if (A[0] % 2 == 0 && A[A.lastIndex] % 2 == 0) return "YES"

        return "NO"
    }
}
