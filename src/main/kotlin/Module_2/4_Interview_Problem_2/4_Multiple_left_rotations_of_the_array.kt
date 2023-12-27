/*
Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.
A = [1, 2, 3, 4, 5]
B = [2, 3]

[ [3, 4, 5, 1, 2] [4, 5, 1, 2, 3] ]
 */

class MultipleLeftRotationsOfTheArray {
    fun solve(A: IntArray, B: IntArray): Array<IntArray> {
        var result = ArrayList<IntArray>()

        for (i in B) {
            var temp = ArrayList<Int>()
            var rotate = i % A.size
            for (j in rotate until A.size) {
                temp.add(A[j])
            }
            for (k in 0 until rotate) {
                temp.add(A[k])
            }

            result.add(temp.toIntArray())

        }

        return result.toTypedArray()
    }

}