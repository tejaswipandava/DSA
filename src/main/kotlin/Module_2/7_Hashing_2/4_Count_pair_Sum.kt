/*
You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.

Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
 */

class CountPairSum {
    fun solve(A: IntArray, B: Int): Int {

        var hs = HashMap<Int, Int>()
        var result = 0
        var mod = (Math.pow(10.0, 9.0) + 7).toInt()
        for (ele in A) {
            val diff = B - ele
//            if (hs.contains(diff)) {
//                result += hs[diff]!!
//                result %= mod
//            }

            result += hs.getOrDefault(diff, 0)
            result %= mod
            hs[ele] = hs[ele]?.plus(1) ?: 1
        }

        return result
    }
}