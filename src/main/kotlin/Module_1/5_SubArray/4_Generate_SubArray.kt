/*
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.
 */

class GenerateSubArray {
    fun solve(A: IntArray): Array<IntArray> {

        var result = ArrayList<IntArray>()

        for (start in 0..A.lastIndex) {
            var subArray = ArrayList<Int>()
            for (end in start..A.lastIndex) {
                subArray.add(A[end])
                result.add(subArray.toIntArray())
            }
        }

        return result.toTypedArray()
    }
}

