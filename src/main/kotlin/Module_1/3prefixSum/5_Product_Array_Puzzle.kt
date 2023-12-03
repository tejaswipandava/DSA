/*
Given an array of integers A, find and return the product array of the same size where the ith element
of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.
 */

class ProductArrayPuzzle {
    fun solve(A: IntArray): IntArray {

        var leftFix = IntArray(A.size) { 0 }
        var rightFix = IntArray(A.size) { 0 }

        leftFix[0] = A[0]
        for (i in 1..A.lastIndex) {
            leftFix[i] = leftFix[i - 1] * A[i]
        }

        rightFix[A.lastIndex] = A[A.lastIndex]
        for (i in A.lastIndex - 1 downTo 0) {
            rightFix[i] = rightFix[i + 1] * A[i]
        }

        for (i in 0..A.lastIndex) {
            if (i == 0) A[i] = rightFix[i + 1]
            else if (i == A.lastIndex) A[i] = leftFix[A.lastIndex - 1]
            else A[i] = leftFix[i - 1] * rightFix[i + 1]
        }

        return A
    }
}


