/*
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
 */

class CountUniqueNumbers {
    fun solve(A: IntArray): Int {

        var hm = HashMap<Int, Int>()
        var result = 0
        A.forEach { it -> hm[it] = hm[it]?.plus(1) ?: 1 }

        for ((key, ele) in hm) {
            if (ele == 1) result++
        }
        return result
    }
}
