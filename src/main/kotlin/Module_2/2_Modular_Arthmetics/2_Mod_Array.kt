/*
You are given a large number in the form of a array A of size N where each element denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.
 */

class ModArray {
    fun solve(A: IntArray, B: Int): Int {

        var ans: Long = 0
        var pow: Long = 1

        for (i in A.lastIndex downTo 0) {
            ans = (ans + (A[i] * pow) % B) % B
            pow = (pow * 10) % B
        }

        return ans.toInt()
    }
}

