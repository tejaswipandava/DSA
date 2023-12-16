/*
Given an integer A. Unset B bits from the right of A in binary.

For example, if A = 93 and B = 4, the binary representation of A is 1011101.
If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to the decimal value 80.

17--> cnt 0
17 -> 16 = 1
16 ->8   = 1
8 -> 4   = 1
4 -> 2   = 1
2 -> 1   = 1
1 -> 0   = 2

15--> cnt 0
15 -> 14 = 1
14 -> 7  = 1
7 -> 6   = 2
6 -> 3   = 2
3 -> 2   = 3
2 -> 1   = 3
1 -> 0   = 4
 */

class UnsetXBitsFromRight {
    fun solve(A: Long, B: Int): Long {

//method 1: brute force
        // var num =A
        // var pow2: Long =0

        // for(i in 0..B-1){
        //     if(num and 1L == 1L){
        //         pow2 += (1 shl i)
        //     }
        //     num = num shr 1
        // }

        // return A xor pow2

//method 2: shift in motion
        var num = A shr B
        return num shl B
    }
}
