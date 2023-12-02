/*
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
Check if any good pair exist or not.
 */

class GoodPair {
    fun solve(A: IntArray, B: Int): Int {

        for (i in 0..A.lastIndex) {
            for (j in i + 1..A.lastIndex) {
                if (A[i] + A[j] == B) return 1
            }
        }

        return 0
    }
}
