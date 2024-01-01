/*
You are given an array of N integers, A1, A2 ,..., AN and an integer B.
Return the of count of distinct numbers in all windows of size B.
Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
NOTE: if B > N, return an empty array.
 */

class DistinctNumbersInWindow {
    fun dNums(A: IntArray, B: Int): IntArray {

        var hm = HashMap<Int, Int>()
        var result = ArrayList<Int>()
        if (B > A.size) return result.toIntArray()

        for (idx in 0..B - 1) {
            hm[A[idx]] = hm[A[idx]]?.plus(1) ?: 1
        }

        result.add(hm.size)
        var st = 0
        for (idx in B..A.lastIndex) {
            //remove the first element
            hm[A[st]] = hm[A[st]]!!.minus(1)
            if (hm[A[st]]!! <= 0) hm.remove(A[st])
            st++

            //add new element
            hm[A[idx]] = hm[A[idx]]?.plus(1) ?: 1

            result.add(hm.size)

        }

        return result.toIntArray()
    }
}
