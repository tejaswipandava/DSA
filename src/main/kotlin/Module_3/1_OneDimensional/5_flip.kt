/*
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN.
In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N
and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array.
Else, return an array consisting of two elements denoting L and R.
If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
A = '100011111000010001'
o/p = [10,17]
A = "010"
Pair of [L, R] | Final string
_______________|_____________
[1 1]          | "110"
[1 2]          | "100"
[1 3]          | "101"
[2 2]          | "000"
[2 3]          | "001"

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
 */

class Flip {
    fun flip(A: String): IntArray {

        var start = -1
        var end = -1
        var count = 0
        var maxCount = 0
        var s = 0

        for (e in 0..A.lastIndex) {
            if (A[e] == '0') count++ else count--

            if (count > maxCount) {
                maxCount = count
                start = s
                end = e
            }

            if (count < 0) {
                count = 0
                s = e + 1
            }
        }

        return if (start == -1 && end == -1) intArrayOf() else intArrayOf(start + 1, end + 1)

    }
}
