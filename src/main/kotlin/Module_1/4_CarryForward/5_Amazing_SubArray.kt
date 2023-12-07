/*
You are given a string S, and you have to find all the amazing substrings of S.
An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 */

class AmazingSubArray {
    fun solve(A: String): Int {
        var count = 0
        var arr = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        for (i in 0..A.lastIndex) {
            if (arr.contains(A[i])) {
                count = (count + (A.lastIndex - i + 1)) % 10003
            }
        }

        return count
    }
}
