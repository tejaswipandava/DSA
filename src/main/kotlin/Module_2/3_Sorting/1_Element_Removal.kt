/*
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.
 */
class ElementRemoval {
    fun solve(A: IntArray): Int {
        A.sortDescending()

        var sum = 0
        for (i in 0..A.lastIndex) {
            sum += (i + 1) * A[i]
        }

        return sum
    }
}
