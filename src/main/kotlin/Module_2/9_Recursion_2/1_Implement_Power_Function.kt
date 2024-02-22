/*
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
 */

class PowerFunction() {
    fun solve(A: Int, B: Int, C: Int): Int {
        var power = pow(A, B, C)
        return if (power < 0) (C + power).toInt() else power.toInt()
    }

    fun pow(A: Int, B: Int, C: Int): Long {
        if (A == 0) return 0
        if (B == 0) return 1

        val mul = pow(A, B / 2, C)
        val ans = (mul * mul) % C

        return if (B % 2 == 0) (ans) else (A % C * ans) % C
    }
}