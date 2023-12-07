/*
You are given a constant array A.
You are required to return another array which is the reversed form of the input array.
 */
class ReverseArray {
    fun solve(A: IntArray): IntArray {
        reverseArray(A, 0, A.lastIndex)
        return A
    }

    fun reverseArray(A: IntArray, start: Int, end: Int) {
        var start = start
        var end = end
        while (start <= end) {
            var temp = A[start]
            A[start] = A[end]
            A[end] = temp

            start++
            end--
        }
    }
}
