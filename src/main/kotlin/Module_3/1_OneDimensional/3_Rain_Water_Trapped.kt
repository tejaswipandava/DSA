/*
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.

A:[1,0,2,5,1,0,3,0,0,7]
o/p = 22

[-1,1,-1,-3,4,5,2,5,5,-2]
=> 1+4+5+2+5+5 => 22
 */

class RainWaterTrapped {
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
}
