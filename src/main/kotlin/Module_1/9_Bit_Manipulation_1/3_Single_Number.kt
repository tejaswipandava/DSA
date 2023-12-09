/*
* Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
class SingleNumber {
    fun singleNumber(A: IntArray): Int {

        var result = 0
        for (ele in A) {
            result = result xor ele
        }

        return result
    }
}
