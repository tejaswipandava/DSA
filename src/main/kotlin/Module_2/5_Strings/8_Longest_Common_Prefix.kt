/*
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 */

class LongestCommonPrefix {
    fun longestCommonPrefix(A: Array<String>): String {

        var words = A.sorted().toTypedArray()
        var pos = findPos(words)
        return if (pos == -1) "" else words[0].substring(0, pos + 1)
    }

    fun findPos(words: Array<String>): Int {
        var index = 0
        var pos = -1
        while (index <= words[0].lastIndex) {
            var str = words[0][index]
            for (ele in words) {
                if (str != ele[index]) return pos
            }
            pos++
            index++
        }

        return pos
    }
}
