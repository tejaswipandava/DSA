/*
You are given A, B and C .
Calculate the value of (A ^ B) % C
 */

class PowerOfModules {
    fun solve(A: Int, B: Int, C: Int): Int {

        if (B == 0) return 1

        var sum = 1L
        for (i in 1..B) {
            sum = (sum * A) % C
        }

        return sum.toInt()
    }
}

