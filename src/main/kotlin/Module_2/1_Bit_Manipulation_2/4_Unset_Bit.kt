/*
You are given two integers A and B.
If B-th bit in A is set, make it unset.
If B-th bit in A is unset, leave as it is.
Return the updated A value.

Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

class UnsetBit {
    fun solve(A: Int, B: Int): Int {

        return if (A and (1 shl B) == (1 shl B)) A xor (1 shl B) else A
    }
}
