/*
Given two binary strings A and B. Return their sum (also a binary string).
 */

class AddBinaryNumbers {
    fun addBinary(A: String, B: String): String {
        var A = A
        var B = B
        var carry = 0
        var sum = 0
        var que = 0
        var buff = 0
        var buffstr = ""

        buff = Math.abs(B.length - A.length)
        for (i in 1..buff) {
            buffstr += "0"
        }
        if (A.length < B.length) A = buffstr + A else B = buffstr + B

        var str = A.toCharArray()

        for (i in A.lastIndex downTo 0) {
            var e1 = A[i].digitToInt()
            var e2 = B[i].digitToInt()

            sum = carry + e1 + e2
            que = sum % 2
            carry = sum / 2

            str[i] = '0' + que

        }

        return if (carry == 0) String(str) else "1" + String(str)
    }
}
