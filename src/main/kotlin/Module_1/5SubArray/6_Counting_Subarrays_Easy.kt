/*
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.
 */
class CountingSubarraysEasy {
    fun solve(A: IntArray, B: Int): Int {

        var result = 0
        for (start in 0..A.lastIndex) {
            var sum = 0
            for (end in start..A.lastIndex) {
                sum += A[end]
                if (sum < B) result++
            }
        }

        return result
    }
}
