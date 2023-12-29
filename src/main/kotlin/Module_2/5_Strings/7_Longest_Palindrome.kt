/*
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)
Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).
 */

class LongestPalindrome {
    fun longestPalindrome(A: String): String {
        var result = ""

        for (i in 0..A.lastIndex) {
            var pal = palindrome(A, i, i)
            if (pal.length > result.length) result = pal
        }

        for (i in 0..A.lastIndex - 1) {
            var pal = palindrome(A, i, i + 1)
            if (pal.length > result.length) result = pal
        }

        return result
    }

    fun palindrome(A: String, p1: Int, p2: Int): String {
        var p1 = p1
        var p2 = p2
        while (p1 >= 0 && p2 <= A.lastIndex && A[p1] == A[p2]) {
            p1--
            p2++
        }

        return A.substring(p1 + 1, p2)
    }
}
