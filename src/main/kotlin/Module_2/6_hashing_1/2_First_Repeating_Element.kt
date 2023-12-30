/*
Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
If there is no repeating element, return -1.
 */

class FirstRepeatingElement {
    fun solve(A: IntArray): Int {
        var hm = HashMap<Int, Int>()

        for (ele in A) {
            hm[ele] = hm[ele]?.plus(1) ?: 1
        }

        for (ele in A) {
            if (hm[ele]!! > 1) return ele
        }

        return -1
    }

    fun solve2(A: IntArray): Int {

        var hashMap = HashMap<Int, Int>()

        A.map { it -> hashMap[it] = hashMap[it]?.plus(1) ?: 1 }

        A.map { it ->
            if (hashMap[it]!! > 1) return it
        }

        return -1
    }
}
