/*
Reverse the bits of an 32 bit unsigned integer A.
 */

fun reverse(A: UInt): UInt {

    var num = A
    var pos = 31
    var rev: UInt = 0u
    while (num > 0u) {
        if (num and 1u == 1u) {
            rev = rev or (1u shl pos)
        }
        pos--
        num = num shr 1
    }

    return rev
}