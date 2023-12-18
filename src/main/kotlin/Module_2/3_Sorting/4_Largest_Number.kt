/*
Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.
A = [3, 30, 34, 5, 9]
output = "9534330"
 */
class largestNumber {
    fun largestNumber(A: IntArray): String {
        var result = A.sortedWith(compareNumber()).joinToString("")
        return if (result[0] == '0') "0" else result
    }
}

class compareNumber : Comparator<Int> {
    override fun compare(ele1: Int, ele2: Int): Int {
        var e1 = ele1.toString()
        var e2 = ele2.toString()

        var num1 = (e1 + e2).toLong()
        var num2 = (e2 + e1).toLong()

        return if (num1 - num2 > 0) -1 else 1
    }
}
