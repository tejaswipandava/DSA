/*
Given an array B of length A with elements 1 or 0. Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.
Note : The answer can be large. So, return type must be long.
 */

class subArrayWithBitWiseOR {
    fun solve(A: Int, B: IntArray): Long {

        var countZero = 0L
        var n = B.size.toLong()
        var totalSubArray = (n * (n + 1)) / 2

        //holds count of possibilities of consecutive 0 subarray
        var subZero = 0L
        for (ele in B) {
            if (ele == 0) countZero++
            else {
                //n(n+1)/2 gives us all possible subarray
                subZero += (countZero * (countZero + 1)) / 2
                countZero = 0
            }
        }

        //in case last element is zero 
        subZero += (countZero * (countZero + 1)) / 2

        return totalSubArray - subZero

    }

    fun bruteForce(A: Int, B: IntArray): Long {

        var result = 0L

        for (s in 0..B.lastIndex) {
            var value = 0
            for (e in s..B.lastIndex) {
                value = value or B[e]
                if (value == 1) result++
            }
        }

        return result
    }
}
