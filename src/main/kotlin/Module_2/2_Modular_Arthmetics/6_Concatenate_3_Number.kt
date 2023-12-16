/*
Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.
 */

class Concatenate3Number {
    fun solve(A: Int, B: Int, C: Int): Int {

        val arr = intArrayOf(A, B, C)
        arr.sort()

        return arr[0] * 10000 + arr[1] * 100 + arr[2]
    }

    fun solve2(A: Int, B: Int, C: Int): Int {

        var arr = intArrayOf(A, B, C)
        arr.sort()
        var s = ""
        for (i in arr) {
            s += i.toString()
        }

        return s.toInt()
    }
}