/*
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */

class EquilibriumIndex {
    fun solve(A: IntArray): Int {

        for (i in 1..A.lastIndex) {
            A[i] = A[i] + A[i - 1]
        }

        var left = 0
        var right = 0
        var last = A.lastIndex

        for (i in 0..last) {
            if (i == 0) {
                left = 0
                right = A[last] - A[i]
            } else if (i == last) {
                left = A[i - 1]
                right = 0
            } else {
                left = A[i - 1]
                right = A[last] - A[i]
            }

            if (left == right) return i
        }

        return -1
    }
}
