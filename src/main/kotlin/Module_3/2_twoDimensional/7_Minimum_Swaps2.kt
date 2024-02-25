/*
Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)].
It is allowed to swap any two elements (not necessarily consecutive).

Find the minimum number of swaps required to sort the array in ascending order.
A = [1, 2, 3, 4, 0]
There are many ways, to make the array sorted,

One of the sequence of swaps as follow:
    Initial array   ->   [1, 2, 3, 4, 0]
 swapping (1, 2) becomes [2, 1, 3, 4, 0]
 swapping (2, 3) becomes [3, 1, 2, 4, 0]
 swapping (4, 0) becomes [3, 1, 2, 0, 4]
 swapping (3, 0) becomes [0, 1, 2, 3, 4].
Thus the array is sorted in 4 swaps.  It cannot be sorted inlesser than 4 swaps.

A = [2, 0, 1, 3]
One of the sequence of swaps as follow:
    Initial array  ->    [2, 0, 1, 3]
 swapping (2, 0) becomes [0, 2, 1, 3]
 swapping (1, 2) becomes [0, 1, 2, 3].

Thus the array is sorted in 2 swaps. It cannot be sorted in lesser than 4 swaps.
 */

class MinimumSwap2 {
    fun solve(A: IntArray): Int {

        var swapCount = 0

        var i = 0
        while (i <= A.lastIndex) {
            if (A[i] != i) {
                swapCount++
                swap(A, i)
            } else {
                i++
            }
        }

        return swapCount
    }

    fun swap(A: IntArray, i: Int) {
        var index = A[i]
        var temp = A[i]
        A[i] = A[index]
        A[index] = temp
    }
}

