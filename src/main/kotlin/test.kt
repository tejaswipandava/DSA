class Solution {
    fun solve(A: IntArray, B: Int): IntArray {
        var sum = 0
        var s = 0
        var e = 0

        while (s < A.size) {
            sum += A[e]
            e++
            while (sum > B) {
                sum -= A[s]
                s++
            }

            if (sum == B) return getElements(A, s, e - 1)
        }

        return intArrayOf(-1)
    }

    fun getElements(A: IntArray, st: Int, end: Int): IntArray {
        var result = ArrayList<Int>()
        for (i in st..end) {
            result.add(A[i])
        }
        return result.toIntArray()
    }
}
