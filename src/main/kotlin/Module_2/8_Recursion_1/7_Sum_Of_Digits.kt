/*
Given a number A, we need to find the sum of its digits using recursion.
 */

class SumOfDigits {
    fun solve(A: Int): Int {
        return findDigitSum(A)
    }

    fun findDigitSum(A: Int): Int {
        if (A == 0) return 0
        var rem = A % 10
        return rem + findDigitSum(A / 10)
    }
}
