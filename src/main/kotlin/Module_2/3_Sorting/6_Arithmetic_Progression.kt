/*
Given an integer array A of size N.
Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 */

class ArithmeticProgression {
    fun solve(A: IntArray): Int {
        A.sort()
        var diff = A[1] - A[0]

        for (i in 1..A.lastIndex) {
            if (A[i] - A[i - 1] != diff) return 0
        }

        return 1
    }
}
