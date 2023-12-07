/*Given an array A of N integers and also given two integers B and C.
Reverse the elements of the array A within the given inclusive range [B, C].
 */
class ReverseRange {
    fun solve(A: IntArray, B: Int, C: Int): IntArray {
        reverseArray(A, B, C)
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
