/*
You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset
Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

class CheckBit {
    fun solve(A: Int, B: Int): Int {

        //with and we can check if the  bit is set or unset
        //example 100 and 001 =001 similarly 101 and 100 = 100
        //return if(A and (1 shl B) == (1 shl B)) 1 else 0

        //or is used to set b can set bits
        //100 or 010 = 110 value increase by powerof2
        //101 or 100 = 101 value doesn't get changes
        //return if(A or (1 shl B) == A) 1 else 0

        //xor is used to toggle value
        //100 xor 010 = 110 value increased by powerOf2
        //101 xor 100 = 001 value decreased by powerOf2
        return if (A xor (1 shl B) < A) 1 else 0
    }
}