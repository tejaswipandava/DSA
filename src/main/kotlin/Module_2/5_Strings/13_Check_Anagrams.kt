/*
You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
 */

class CheckAnagrams {
    fun solve(A: String, B: String): Int {
        var f1 = IntArray(26)
        var f2 = IntArray(26)

        for (i in 0..A.lastIndex) {
            var index1 = A[i] - 'a'
            var index2 = B[i] - 'a'
            f1[index1]++
            f2[index2]++
        }

        for (i in 0..25) {
            if (f1[i] != f2[i]) return 0
        }

        return 1
    }

    fun solve1(A: String, B: String): Int {
        var str1 = String(A.toSortedSet().toCharArray())
        var str2 = String(B.toSortedSet().toCharArray())

        return if (str1.equals(str2)) 1 else 0
    }
}
