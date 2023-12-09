/*
Given an array of size N, find the majority element.
The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.
 */

class MajorityElement {
    fun majorityElement(A: IntArray): Int {

        var count = 1
        var max = A[0]

        for (i in 1..A.lastIndex) {
            if (A[i] == max) count++
            else {
                if (count == 1) max = A[i]
                else {
                    count--
                }
            }
        }

        return max
    }
}
