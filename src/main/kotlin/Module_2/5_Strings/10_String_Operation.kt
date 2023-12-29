/*
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 */

class StringOperation {
    fun solve(A: String): String {

        var charSet = charArrayOf('a', 'e', 'i', 'o', 'u')
        var str = ""
        for (ele in A) {
            if (charSet.contains(ele)) str += "#"
            else if (ele in 'a'..'z') str += ele
        }

        return str + str
    }
}