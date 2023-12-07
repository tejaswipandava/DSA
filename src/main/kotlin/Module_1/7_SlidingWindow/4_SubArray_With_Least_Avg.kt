/*
Given an array A of size N, find the subarray of size B with the least average
 */
class SubarrayWithLeastAvg {
    fun solve(A: IntArray, B: Int): Int {

        var sum = 0.0
        var avg = 0.0
        var ans = 0.0
        var index = 0
        for (i in 0..B - 1) {
            sum += A[i]
        }

        avg = sum / B
        ans = avg

        for (i in B..A.lastIndex) {
            sum = sum - A[i - B] + A[i]
            avg = sum / B

            if (avg < ans) {
                index = i - B + 1
                ans = avg
            }

        }

        return index
    }
}
