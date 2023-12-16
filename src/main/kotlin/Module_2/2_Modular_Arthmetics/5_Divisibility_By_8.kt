/*
You are given a number A in the form of a string. Check if the number is divisible by eight or not.
Return 1 if it is divisible by eight else, return 0.
 */

class DivisibilityBy8 {
    fun solve(A: String): Int {

        var num = 0

        if (A.length > 3) num = A.slice(A.lastIndex - 3..A.lastIndex).toInt()
        else num = A.toInt()

        return if (num % 8 == 0) 1 else 0
    }
}