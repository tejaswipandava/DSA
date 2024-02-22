class Solution {

    var startIndex = -1
    var endIndex = -1

    fun flip(A: String): IntArray {

        kadenesmaxOne(A)
        if (startIndex == -1 && endIndex == -1) return intArrayOf(1, A.length)

        var count = endIndex - startIndex + 1
        if (count == A.length) return intArrayOf()

        var left = countLeftZero(A, startIndex)
        var right = countRightZero(A, endIndex)

        if (left >= right) {
            var r = startIndex
            var l = startIndex - left + 1
            return intArrayOf(l, r)
        } else {
            var l = endIndex + 2
            var r = endIndex + right + 1
            return intArrayOf(l, r)
        }
    }

    fun kadenesmaxOne(A: String) {
        var sum = 0
        var max = 0
        var s = 0
        for (e in 0..A.lastIndex) {
            if (A[e] == '1') {
                sum++
            } else {
                sum = 0
                s = e + 1
            }

            if (sum > max) {
                max = sum
                endIndex = e
                startIndex = s
            }
        }
    }

    fun countLeftZero(A: String, idx: Int): Int {
        var pos = idx
        var count = 0
        for (i in idx - 1 downTo 0) {
            if (A[i] == '0') count++
            else break
        }

        return count
    }

    fun countRightZero(A: String, idx: Int): Int {
        var pos = idx
        var count = 0
        for (i in idx + 1..A.lastIndex) {
            if (A[i] == '0') count++
            else break
        }

        return count
    }
}
