/*
You are given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.
 */

class ChangeCharacter {
    fun solve(A: String, B: Int): Int {

        //load freq array
        var fMap = IntArray(26)
        for (ele in A) {
            var idx = ele - 'a'
            fMap[idx]++
        }

        var sMap = fMap.sorted()

        //remove distinct elements
        var sum = 0
        for (i in 0..25) {
            sum += sMap[i]
            if (sum > B) {
                return 26 - i
            }
        }

        return 1
    }
}
