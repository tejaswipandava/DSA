/*
Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
 */

class CountSort {
    fun solve(A: IntArray): IntArray {
        var freqmap = IntArray(100001)
        var result = ArrayList<Int>()

        for (ele in A) {
            freqmap[ele]++
        }

        for (i in 0..freqmap.lastIndex) {
            var count = freqmap[i]
            while (count >= 1) {
                result.add(i)
                count--
            }
        }

        return result.toIntArray()
    }
}
