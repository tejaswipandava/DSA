/*
Given a decimal number A and a base B, convert it into its equivalent number in base B.
 */

class DecimalToAnyBase {
    fun DecimalToAnyBase(A: Int, B: Int): Int {
        return numWay(A, B)
    }

    fun stringWay(A: Int, B: Int): Int {
        if (A < 2) return A

        var result = ""

        var value = A
        while (value >= 1) {
            var reminder = value % B
            value = value / B

            result = reminder.toString() + result

        }

        return result.toInt()
    }

    fun numWay(A: Int, B: Int): Int {
        var result = 0
        var value = A
        var base = 1
        while (value >= 1) {
            var rem = value % B
            value = value / B

            result = rem * base + result
            base *= 10
        }

        return result
    }


}
