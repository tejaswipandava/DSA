/*
Given an array A of length N. Also given are integers B and C.
Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 */
class SubaaryWithGivenSumAndLength {
    fun solve(A: IntArray, B: Int, C: Int): Int {

        var sum = 0
        for (i in 0..A.lastIndex) {
            sum += A[i] //every new element getting added

            if (i >= B) {
                sum -= A[i - B] //logic to remove first element
            }

            if (sum == C && i >= B - 1) { //i condition required to make sure our window is of B length
                return 1
            }
        }

        return 0
    }

    fun bruteWindow(A: IntArray, B: Int, C: Int): Int {

        var sum = 0
        for (i in 0..B - 1) {
            sum += A[i]
        }
        if (sum == C) return 1

        for (i in B..A.lastIndex) {
            sum = sum + A[i] - A[i - B]
            if (sum == C) return 1
        }

        return 0
    }
}
