/*
Given an array A of N integers.
Find the length of the longest subarray in the array which sums to zero.

If there is no subarray which sums to zero then return 0.
 */

class LongestSubArrayZeroSum {
    fun solve(A: IntArray): Int {

        var hm = HashMap<Long, Int>()
        var pf = ArrayList<Long>()
        var result = 0
        pf.add(A[0].toLong())

        for (i in 1..A.lastIndex) {
            pf.add(A[i] + pf[i - 1])
        }

        hm.put(0, -1)

        for (i in 0..pf.lastIndex) {
            if (hm.contains(pf[i])) result = Math.max(result, i - hm[pf[i]]!!)
            else hm[pf[i]] = i
        }

        return result
    }

    fun solve2(A: IntArray): Int {

        var hm = HashMap<Long, Int>()
        var result = 0
        var sum = 0L


        hm.put(sum, -1)

        for (i in 0..A.lastIndex) {
            sum = sum + A[i]
            if (hm.contains(sum)) result = Math.max(result, i - hm[sum]!!)
            else hm[sum] = i
        }

        return result
    }
}
