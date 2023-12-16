/*
You are given two integers A and B.
If B-th bit in A is set, make it unset
If B-th bit in A is unset, make it set
Return the updated A value
 */


class ToggleBits {
    fun solve(A: Int, B: Int): Int {

        return A xor (1 shl B)
    }
}
