/*
Given an array of integers A and an integer B,
find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.

 A = [1, 12, 10, 3, 14, 10, 5]
 B = 8

 A = [1, 12, 10, 3, 14, 10, 5]
 After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 Now, all elements less than or equal to 8 are together.
 */

class MinimumSwapsRepeat {
    fun solve(A: IntArray, B: Int): Int {
        var count = findMinNumber(A, B)

        var badCount = 0
        for (i in 0..count - 1) {
            if (A[i] > B) badCount++
        }

        var ans = badCount
        var s = 0
        var e = count
        while (e <= A.lastIndex) {
            if (A[s] > B) badCount--
            if (A[e] > B) badCount++

            s++
            e++

            ans = Math.min(ans, badCount)
        }

        return ans
    }

    fun findMinNumber(A: IntArray, B: Int): Int {
        var count = 0
        for (i in 0..A.lastIndex) {
            if (A[i] <= B) count++
        }

        return count
    }
}
