/*
You're given a read-only array of N integers.
Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Note: Read-only array means that the input array should not be modified in the process of solving the problem
 */
class N3RepeatedNumber {
    fun repeatedNumber(A: IntArray): Int {

        var lead1 = Int.MIN_VALUE
        var lead2 = Int.MIN_VALUE

        var count1 = 0
        var count2 = 0

        for (i in 0..A.lastIndex) {
            if (lead1 == A[i]) count1++
            else if (lead2 == A[i]) count2++
            else if (count1 == 0) {
                lead1 = A[i]
                count1 = 1
            } else if (count2 == 0) {
                lead2 = A[i]
                count2 = 1
            } else {
                count1--
                count2--
            }
        }

        count1 = 0
        count2 = 0

        for (i in 0..A.lastIndex) {
            if (A[i] == lead1) count1++
            if (A[i] == lead2) count2++
        }

        if (count2 > A.size / 3) return lead2
        else if (count1 > A.size / 3) return lead1
        else return -1

    }
}
