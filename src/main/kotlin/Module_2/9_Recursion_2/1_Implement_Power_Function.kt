/*
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
 */

class PowerFunction() {
    fun solve(A: Int, B: Int, C: Int): Int {
        var result = RecursivePow(A, B, C)
        return if (result < 0L) C - result.toInt() else result.toInt()
    }

    fun RecursivePow(A: Int, B: Int, C: Int): Long {
        if (A == 0) return 0
        if (B == 0) return 1
        return ((RecursivePow(A, B - 1, C) % C) * A) % C
    }
}