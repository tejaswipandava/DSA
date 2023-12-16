/*
You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal Number System.

Note:
The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

class SetBit {
    fun solve(A: Int, B: Int): Int {
        var result = 0

        result = result or (1 shl A)
        result = result or (1 shl B)

        return result
    }
}
