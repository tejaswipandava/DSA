/*
Given an array A and an integer B, find the number of occurrences of B in A.
 */
class LinearSearchMultipleOccurences {
    fun solve(A: IntArray, B: Int): Int {
        var count = 0
        A.forEach { it ->
            if (it == B) count++
        }
        return count
    }
}
