/*
Given an integer array A, find if an integer p exists in the array
such that the number of integers greater than p in the array equals p.
 */

class NobleInteger {
    fun solve(A: IntArray): Int {

        A.sortDescending()
        var cnt = 0

        if (A[0] == 0) return 1

        for (i in 1..A.lastIndex) {
            if (A[i] != A[i - 1]) cnt = i
            if (A[i] == cnt) return 1
        }
        return -1
    }
}
