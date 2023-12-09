class Solution {
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
