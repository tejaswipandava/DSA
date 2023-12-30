/*
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large,
return the remainder on dividing the result with 109+7
 */

class CountSubArrayZeroSum {
    fun solve(A: IntArray): Int {

        var sum = 0L
        var result = 0L
        var hs = HashMap<Long, Int>()
        hs.put(sum, 1)

        for (ele in A) {
            sum += ele
            if (hs.contains(sum)) result += hs[sum]!!.toLong()
            hs[sum] = hs[sum]?.plus(1) ?: 1
        }

        return (result % (Math.pow(10.0, 9.0) + 7)).toInt()
    }
}
