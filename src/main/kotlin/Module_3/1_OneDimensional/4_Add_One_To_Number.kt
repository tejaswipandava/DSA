/*
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

[1, 2, 3] -> [1, 2, 4]
 */

class AddOneToNumber {
    fun plusOne(A: IntArray): IntArray {

        var carry = 1
        for (i in A.lastIndex downTo 0) {
            if (carry == 1) A[i] += carry

            carry = A[i] / 10
            A[i] = A[i] % 10
        }

        if (carry == 0) {
            var pos = -1
            for (i in 0..A.lastIndex) {
                if (A[i] != 0) {
                    pos = i
                    break
                }
            }
            return A.sliceArray(pos..A.lastIndex)
        }

        var result = ArrayList<Int>()
        result.add(carry)
        result.addAll(A.toTypedArray())

        return result.toIntArray()
    }
}