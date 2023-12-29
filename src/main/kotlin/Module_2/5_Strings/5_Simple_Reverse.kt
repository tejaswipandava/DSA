/*
Given a string A, you are asked to reverse the string and return the reversed string.
 */

class SimpleReverse {
    fun solve1(A: String): String {
        var str = CharArray(A.length)
        var index = 0

        for (i in A.lastIndex downTo 0) {
            str[index] = A[i]
            index++
        }

        return String(str)
    }

    //the below fails as the conversion of char to string on every iteration is costly
    fun solve2(A: String): String {
        var str = ""

        for (i in A.lastIndex downTo 0) {
            str += A[i]
        }

        return str
    }

    fun solve3(A: String): String {
        var str = StringBuilder()

        for (i in A.lastIndex downTo 0) {
            str.append(A[i])
        }

        return str.toString()
    }
}
