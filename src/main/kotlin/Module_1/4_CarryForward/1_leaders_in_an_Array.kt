/*
Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.
 */

class leadersinArray {
    fun solve(A: IntArray): IntArray {

        var n = A.lastIndex
        var max = A[n]
        var result = ArrayList<Int>()
        result.add(max)
        for (i in n downTo 0) {
            if (A[i] > max) {
                max = A[i]
                result.add(A[i])
            }
        }

        return result.toIntArray()
    }
}
