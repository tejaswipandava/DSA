/*
Given an integer A, find and return the Ath magic number.
A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 */

/*
idea: instead of binary lets consider power of 5
0000 -> 0 --> 0
0001 -> 1 --> 5
0010 -> 2 --> 25
0011 -> 3 --> 30
0100 -> 4 --> 125
0101 -> 5 --> 130
0111 -> 6 --> 155
 */

class NthMagicNumber {
    fun solve(A: Int): Int {

        var pow5 = 1
        var sum = 0
        var num = A

        while (num > 0) {
            pow5 *= 5
            if (num and 1 == 1) {
                sum = sum + pow5
            }
            num = num shr 1
        }

        return sum
    }
}
