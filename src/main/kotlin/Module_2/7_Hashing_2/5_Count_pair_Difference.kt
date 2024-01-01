/*
You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.
 */

class CountPairDifference {

    fun solve(A: IntArray, B: Int): Int {
        var result = 0
        var mod = (Math.pow(10.0, 9.0) + 7).toInt()
        var hm = HashMap<Int, Int>()
        var hm2 = HashMap<Int, Int>()

        for (ele in A) {
            var sum = B + ele
            if (hm.contains(sum)) {
                result += hm[sum]!!
                result = result % mod
            }

            hm[ele] = hm[ele]?.plus(1) ?: 1
        }

        for (i in A.lastIndex downTo 0) {
            var ele = A[i]
            var sum = B + ele
            if (hm2.contains(sum)) {
                result += hm2[sum]!!
                result = result % mod
            }
            hm2[ele] = hm2[ele]?.plus(1) ?: 1
        }

        return result
    }

    fun solveOptimized(A: IntArray, B: Int): Int {
        var result = 0
        var mod = (Math.pow(10.0, 9.0) + 7).toInt()
        var hm = HashMap<Int, Int>()

        // i  - j = B
        // => i = B + j
        // or
        // j = i - B

        for (ele in A) {
            var sum = B + ele
            var diff = ele - B
//            if (hm.contains(sum)) {
//                result += hm[sum]!!
//                result = result % mod
//            } else {
//                if (hm.contains(diff)) {
//                    result += hm[diff]!!
//                    result = result % mod
//                }
//            }
            result += hm.getOrDefault(sum, 0)
            result += hm.getOrDefault(diff, 0)
            result %= mod

            hm[ele] = hm[ele]?.plus(1) ?: 1
        }

        return result
    }
}
