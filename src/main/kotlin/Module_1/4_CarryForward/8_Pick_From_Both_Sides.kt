/*
You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.
 */
class PickFromBothSides {
    fun solve(A: IntArray, B: Int): Int {
        var sum = 0
        for (i in 0..B - 1) {
            sum = sum + A[i]
        }
        var ans = sum
        var backIndex = A.lastIndex
        for (i in B - 1 downTo 0) {
            sum = sum + A[backIndex] - A[i]
            ans = Math.max(ans, sum)
            backIndex--
        }

        return ans
    }
}
