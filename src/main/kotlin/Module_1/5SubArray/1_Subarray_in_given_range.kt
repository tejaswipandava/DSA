/*Given an array A of length N, return the subarray from B to C.*/
class subarrayingivenrange {
    fun solve(A: IntArray, B: Int, C: Int): IntArray {

        var result = ArrayList<Int>()
        for (i in B..C) {
            result.add(A[i])
        }

        return result.toIntArray()
    }

    fun systemSubArray(A: IntArray, B: Int, C: Int): IntArray {
        return A.sliceArray(B..C)
    }
}
