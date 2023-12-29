/*
You are given a function to_lower() which takes a character array A as an argument.

Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.
 */

class ToLower {
    fun to_lower(A: CharArray): CharArray {
        for (i in 0..A.lastIndex) {
            if (A[i] in 'A'..'Z') {
                A[i] = A[i] + ('a' - 'A')
            }
        }

        return A
    }
}

