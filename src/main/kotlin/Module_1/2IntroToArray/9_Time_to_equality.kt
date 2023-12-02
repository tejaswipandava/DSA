/*
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.
 */
class TimeToEquality {
    fun solve(A: IntArray): Int {

        var max = findMax(A)
        var sum = 0

        for (i in 0..A.lastIndex) {
            sum += (max - A[i])
        }

        return sum
    }

    fun findMax(A: IntArray): Int {
        var max = A[0]

        A.forEach {
            if (it > max) max = it
        }

        return max
    }
}
