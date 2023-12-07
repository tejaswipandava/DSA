/*
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
 */

class SumOfAllSubArray {
    fun subarraySum(A: IntArray): Long {
        var result = 0L
        var N = A.size

        //contribution technique (i+1)(n-i)A[i]
        for (i in 0..A.lastIndex) {
            result += (i + 1) * (N - i).toLong() * A[i].toLong()
        }
        return result
    }

    fun failedSubArray(A: IntArray): Long {
        var result = 0L

        for (start in 0..A.lastIndex) {
            var sum = 0L
            for (end in start..A.lastIndex) {
                sum += A[end].toLong()
                result += sum
            }
        }

        return result
    }
}

