/*
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.
 */

class SubArrayWithSum0 {
    // Do not write code to include libraries, main() function or accept any input from the console.
    // Initialization code is already written and hidden from you. Do not write code for it again.
    fun solve1(A: IntArray): Int {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        var pf = ArrayList<Long>()
        var hs = HashSet<Long>()
        pf.add(A[0].toLong())

        for (i in 1..A.lastIndex) {
            pf.add(pf[i - 1] + A[i])
        }

        pf.map { hs.add(it) }

        return if (pf.contains(0L) || hs.size != pf.size) 1 else 0


    }

    fun solve(A: IntArray): Int {
        //idea: we know when we have prefix value as 0 or same number we know we have sum = 0

        var hs = HashSet<Long>()
        var sum = 0L
        hs.add(sum) //our hashset will have 0 so if it occurs we have it in it

        for (ele in A) {
            sum += ele
            if (hs.contains(sum)) return 1
            else hs.add(sum)
        }
        return 0
    }
}
