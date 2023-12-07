/*
Given an array of integers A and an integer B,
find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.
 */
class MinimumSwaps {
    fun solve(A: IntArray, B: Int): Int {
        var count = 0
        var bad = 0

        A.forEach { if (it <= B) count++ }

        for (i in 0..count - 1) {
            if (A[i] > B) bad++
        }

        var ans = bad

        for (i in count..A.lastIndex) {
            if (A[i] > B) bad++
            if (A[i - count] > B) bad--
            ans = Math.min(ans, bad)
        }

        return ans
    }
}
