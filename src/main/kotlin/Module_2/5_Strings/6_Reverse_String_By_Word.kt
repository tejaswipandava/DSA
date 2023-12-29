/*
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
 */

class ReverseStringByWord {
    fun solve(A: String): String {
        return A.split(" ").reversed().joinToString(" ").trim()
    }

    fun solve2(A: String): String {
        var strList = A.split(' ').toTypedArray()
        var s = 0
        var e = strList.lastIndex
        while (s <= e) {
            var temp = strList[s]
            strList[s] = strList[e]
            strList[e] = temp
            s++
            e--
        }
        return strList.joinToString(" ").trim()
    }
}
