/*
You are given an integer array C of size A.
Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.
 */
class MaximumSubarrayEasy {

    fun maxSubarray(A: Int, B: Int, C: IntArray): Int {
        return windowMaxSubarray(A, B, C)
        //return optimezedMaxSubarray(A, B, C)
        //return bruteMaxSubArray(A, B, C)
    }

    fun windowMaxSubarray(A: Int, B: Int, C: IntArray): Int {
        var result = 0

        var start = 0
        var end = 0
        var sum = 0
        while (start <= C.lastIndex && end <= C.lastIndex) {
            if (sum + C[end] <= B) {
                sum += C[end]
                result = Math.max(result, sum)
                end++
            } else {
                sum -= C[start]
                start++
            }
        }
        return result
    }

    fun optimezedMaxSubarray(A: Int, B: Int, C: IntArray): Int {
        var result = 0

        for (start in 0..C.lastIndex) {
            var sum = 0
            for (end in start..C.lastIndex) {
                sum = sum + C[end]

                if (sum <= B && result < sum) result = sum
            }
        }

        return result
    }

    fun bruteMaxSubArray(A: Int, B: Int, C: IntArray): Int {
        var result = 0

        for (start in 0..C.lastIndex) {
            for (end in start..C.lastIndex) {
                var sum = 0
                for (i in start..end) {
                    sum = sum + C[i]
                }

                if (sum <= B && result < sum) result = sum
            }
        }

        return result
    }
}

