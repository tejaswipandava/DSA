/*
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
 */
class isAlnum {
    fun solve(A: CharArray): Int {
        for (ele in A) {
            if (!(ele in 'A'..'Z' || ele in 'a'..'z' || ele in '0'..'9'))
                return 0
        }

        return 1
    }
}
