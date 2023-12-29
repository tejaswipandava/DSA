/*
You are given a function to_upper() consisting of a character array A.

Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.
 */

class ToUpper {
    fun to_upper(A: CharArray): CharArray {
        for (i in 0..A.lastIndex) {
            if (A[i] in 'a'..'z') {
                A[i] = A[i] + ('A' - 'a')
            }
        }

        return A
    }
}
