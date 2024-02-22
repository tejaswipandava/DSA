/*
Find the maximum sum of contiguous non-empty subarray within an array A of length N.
Input A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
output 6
The subarray [4,-1,2,1] has the maximum possible sum of 6.
 */
class MaxSumContiguousSubarray {
    fun maxSubArray(A: IntArray): Int {
        return kadanesAlgo(A)
    }

    fun kadanesAlgo(A: IntArray): Int {
        var result = Int.MIN_VALUE
        var sum = 0
        for (ele in A) {
            sum += ele
            result = Math.max(result, sum)
            if (sum <= 0) sum = 0
        }

        return result
    }

    //brute Force TC O(n^3) SC O(1)
    fun maxSubArray3Loop(A: IntArray): Int {
        var maxSum = Int.MIN_VALUE

        for (i in 0..A.lastIndex) {
            for (j in i..A.lastIndex) {
                var sum = 0
                for (k in i..j) {
                    sum += A[k]
                }

                maxSum = Math.max(maxSum, sum)
            }
        }

        return maxSum
    }

    //carry Forward TC O(n^2) SC O(1)
    fun maxSubArrayCarrryForward(A: IntArray): Int {

        var maxSum = Int.MIN_VALUE

        for (i in 0..A.lastIndex) {
            var sum = 0
            for (j in i..A.lastIndex) {
                sum += A[j]
                maxSum = Math.max(maxSum, sum)
            }
        }

        return maxSum
    }

    //Prefix TC O(n^2) SC O(n)
    fun maxSubArrayPreFixSum(A: IntArray): Int {

        var maxSum = Int.MIN_VALUE

        for (i in 1..A.lastIndex) {
            A[i] = A[i] + A[i - 1]
        }

        for (i in 0..A.lastIndex) {
            var sum = 0
            for (j in i..A.lastIndex) {
                if (i == 0) sum = A[j]
                else sum = A[j] - A[i - 1]
                maxSum = Math.max(maxSum, sum)
            }
        }

        return maxSum
    }
}