/*
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
 */

class ArrayRotation {
    fun solve(A: IntArray, B: Int): IntArray {

        var totalRotation = B % A.size

        //Reverse the entire array
        reverseArray(A, 0, A.lastIndex)

        //reverse the starting till the rotation index
        //tweek this to make it left or right rotate
        reverseArray(A, 0, totalRotation - 1)

        //reverse from rotation index till end
        //tweek this to make it left or right rotate
        reverseArray(A, totalRotation, A.lastIndex)

        return A
    }

    fun reverseArray(A: IntArray, start: Int, last: Int) {

        var startIndex = start
        var lastIndex = last

        while (lastIndex > startIndex) {

            var temp = A[startIndex]
            A[startIndex] = A[lastIndex]
            A[lastIndex] = temp

            lastIndex--
            startIndex++
        }
    }
}

