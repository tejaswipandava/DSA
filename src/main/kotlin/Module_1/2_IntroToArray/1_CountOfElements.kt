/*
Given an array A of N integers.
Count the number of elements that have at least 1 elements greater than itself.
*/
class CountOfElements {
    fun solve(A: IntArray): Int {

        var max = A[0]
        var maxCount = 0

        for (i in 0..A.lastIndex) {
            if (A[i] > max) {
                max = A[i]
            }
        }

        for (i in 0..A.lastIndex) {
            if (A[i] == max) maxCount++
        }

        return A.size - maxCount

    }
}
