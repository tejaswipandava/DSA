/*
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
 */

class CountOccurances {
    fun solve(A: String): Int {
        var cnt = 0
        for (i in 1..A.lastIndex) {
            if (A[i] == 'o' && A[i - 1] == 'b' && A[i + 1] == 'b') cnt++
        }

        return cnt
    }
}
