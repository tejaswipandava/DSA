/*
Write a program to find the factorial of the given number A using recursion.
Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
 */

class FindFactorial {
    fun solve(A: Int): Int {
        if (A <= 1) return 1
        return A * solve(A - 1)
    }
}
