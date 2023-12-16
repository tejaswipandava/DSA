/*Given a number in the form of an array A of size N.
Each of the digits of the number is represented by A[i].
Check if the number is divisible by 3.
 */

class DivisibilityBy3 {
    fun solve(A: IntArray): Int {

        var sum = 0
        for (i in 0..A.lastIndex) {
            sum = sum + A[i]
        }

        return if (sum % 3 == 0) 1 else 0
    }
}
