/*
Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.

If a number has no tens digit, we can assume value to be 0.
If 2 numbers have same tens digit, in that case number with max value will come first
Solution should be based on comparator.
A = [15, 11, 7, 19]
output = [7, 19, 15, 11]
 */

class TenDigitSorting {
    fun solve(A: IntArray): IntArray {
        return A.sortedWith(CompareTens()).toIntArray()
    }
}

class CompareTens : Comparator<Int> {
    override fun compare(e1: Int, e2: Int): Int {
        var d1 = e1 / 10 % 10
        var d2 = e2 / 10 % 10

        if (d1 == d2) return e2 - e1

        return d1 - d2
    }
}
