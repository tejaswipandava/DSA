/*
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
Input 1:
    A = "111000"
Output 1:
    3
 */

class LengthOfLongestConsecutiveOnes {
    fun solve(A: String): Int {
        var countOf1 = 0

        for (i in 0..A.lastIndex) {
            if (A[i] == '1') countOf1++
        }

        if (countOf1 >= A.lastIndex || countOf1 <= 2) return countOf1

        var lCount = 0
        var rCount = 0
        var ans = 0
        for (i in 0..A.lastIndex) {
            if (A[i] == '0') {
                lCount = leftOneCount(A, i)
                rCount = rightOneCount(A, i)
                if (lCount + rCount == countOf1) ans = Math.max(ans, lCount + rCount) else ans =
                    Math.max(ans, lCount + rCount + 1)
            }
        }

        return ans

    }

    fun leftOneCount(A: String, index: Int): Int {
        var count = 0
        for (i in index - 1 downTo 0) {
            if (A[i] == '0') return count
            count++
        }

        return count
    }

    fun rightOneCount(A: String, index: Int): Int {
        var count = 0
        for (i in index + 1..A.lastIndex) {
            if (A[i] == '0') return count
            count++
        }

        return count
    }
}
