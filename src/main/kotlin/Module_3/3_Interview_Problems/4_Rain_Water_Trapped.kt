/*
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.

A:[1,0,2,5,1,0,3,0,0,7]
o/p = 22

[-1,1,-1,-3,4,5,2,5,5,-2]
=> 1+4+5+2+5+5 => 22
 */
//fun main() {
//    RainWaterTrapped().presuffixtrap2(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
//}

class RainWaterTrappedReturns {
    fun presuffixtrap2(A: IntArray): Int {

        var arr = IntArray(A.size) { 0 }
        var lmax = 0
        var rmax = 0

        for (i in 0..A.lastIndex) {
            lmax = Math.max(lmax, A[i])
            arr[i] = lmax
        }

        for (i in A.lastIndex downTo 0) {
            rmax = Math.max(rmax, A[i])
            arr[i] = Math.min(arr[i], rmax) - A[i]
        }

        var sum = 0
        for (i in 1..A.lastIndex - 1) {
            if (A[i] > 0) sum += A[i]
        }

        return sum
    }

    fun presuffixtrap(A: IntArray): Int {

        var lmax = 0
        var rmax = 0
        var arr = IntArray(A.size) { 0 }

        //left iteration
        for (i in 0..A.lastIndex) {
            arr[i] = lmax - A[i]
            lmax = Math.max(lmax, A[i])
        }

        //right iteration
        for (i in A.lastIndex downTo 0) {
            arr[i] = Math.min(rmax - A[i], arr[i])
            rmax = Math.max(rmax, A[i])
        }

        var sum = 0
        for (i in 0..arr.lastIndex) {
            if (arr[i] > 0) {
                sum += arr[i]
            }
        }

        return sum
    }

    fun trap(A: IntArray): Int {
        var lpos = 0
        var rpos = A.lastIndex
        var lmax = 0
        var rmax = 0
        var ans = 0

        while (lpos < rpos) {
            if (A[lpos] <= A[rpos]) {
                if (A[lpos] > lmax) lmax = A[lpos] else ans += lmax - A[lpos]
                lpos++
            } else {
                if (A[rpos] > rmax) rmax = A[rpos] else ans += rmax - A[rpos]
                rpos--
            }
        }

        return ans

    }

    fun bruteForceTrap(A: IntArray): Int {
        var prefix = prefixSum(A)
        var suffix = suffixSum(A)

        var result = 0
        for (i in 1..A.lastIndex - 1) {
            //find the minimum of both the wall and remove the current height/depth
            var sum = Math.min(prefix[i], suffix[i]) - A[i]
            result += Math.max(0, sum)
        }
        return result
    }

    //maximum wall from left
    fun prefixSum(A: IntArray): IntArray {
        var prefix = IntArray(A.size) { 0 }
        var lmax = 0
        for (i in 0..A.lastIndex) {
            prefix[i] = Math.max(lmax, A[i])
            lmax = prefix[i]
        }

        return prefix
    }

    //maximum wall from right
    fun suffixSum(A: IntArray): IntArray {
        var suffix = IntArray(A.size) { 0 }
        var rmax = 0

        for (i in A.lastIndex downTo 0) {
            suffix[i] = Math.max(rmax, A[i])
            rmax = suffix[i]
        }

        return suffix
    }
}
