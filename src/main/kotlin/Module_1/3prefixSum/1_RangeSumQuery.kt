/*
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */

class RangeSumQuery {
    fun rangeSum(A: IntArray, B: Array<IntArray>): LongArray {

        var result = ArrayList<Long>()
        var prefix = LongArray(A.size) { 0L }

        prefix[0] = A[0].toLong()

        //create an prefix array
        for (i in 1..A.lastIndex) {
            prefix[i] = prefix[i - 1] + A[i].toLong()
        }

        for ((l, r) in B) {
            if (l == 0) result.add(prefix[r])
            else {
                var sum = prefix[r] - prefix[l - 1]
                result.add(sum)
            }
        }

        return result.toLongArray()
    }
}
