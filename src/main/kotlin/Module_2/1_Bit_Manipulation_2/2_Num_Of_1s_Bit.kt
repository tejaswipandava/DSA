/*
Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
 */

class NumOf1sBit {
    fun solve(A: Int): Long {

        return optimalCount1(A)
    }

    fun count1(A: Int): Long {
        var count = 0L
        for (i in 0..31) {
            if (A and (1 shl i) == (1 shl i))
                count++
        }

        return count
    }

    fun optimalCount1(A: Int): Long {
        var num = A
        var count = 0L
        while (num > 0) {
            if (num and 1 == 1) count++
            num = num shr 1
        }

        return count
    }
}
