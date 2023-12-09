/*
You are given a number A. You are also given a base B. A is a number on base B.
You are required to convert the number A into its corresponding value in decimal number system.
 */
class AnyBaseToDecimal {
    fun solve(A: Int, B: Int): Int {
        return numWay(A, B)
    }

    fun stringWay(A: Int, B: Int): Int {
        var result = 0
        var num = A.toString()
        var pow = 1
        for (i in num.lastIndex downTo 0) {
            result += num[i].digitToInt() * pow
            pow = pow * B
        }

        return result
    }

    fun numWay(A: Int, B: Int): Int {
        var value = A
        var base = 1
        var result = 0

        while (value >= 1) {
            var digit = value % 10
            value = value / 10
            result += digit * base
            base *= B
        }

        return result
    }
}
