/*
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.
 */

class CheckPalindrome {
    fun solve(A: String): Int {
        return checkPalindrome(A, 0, A.lastIndex)
    }

    fun checkPalindrome(A: String, s: Int, e: Int): Int {
        if (s > e) return 1
        if (A[s] != A[e]) return 0
        return checkPalindrome(A, s + 1, e - 1)
    }
}
