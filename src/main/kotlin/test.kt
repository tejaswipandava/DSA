class Solution {
    fun longestCommonPrefix(A: Array<String>): String {

        var words = A.sorted().toTypedArray()
        var pos = findPos(words)
        return if (pos == -1) "" else words[0].substring(0, pos+1)
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
