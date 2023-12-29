/*
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
 */

class ToggleCase {
    fun solve(A: String): String {

        var Ac = A.toCharArray()

        for (i in 0..Ac.lastIndex) {
            Ac[i] = (Ac[i].code xor ('a' - 'A')).toChar()
            // if(Ac[i]>='A' && Ac[i]<='Z'){
            //     Ac[i] = Ac[i] + ('a' - 'A')
            // }else{
            //     Ac[i] = Ac[i] + ('A' - 'a')
            // }
        }

        return String(Ac)
    }

    fun solve2(A: String): String {

        var str = CharArray(A.length)

        for (i in 0..A.lastIndex) {
            str[i] = (A[i].code xor 32).toChar()
        }

        return String(str)
    }

    fun solve3(A: String): String {

        var str = ""

        for (i in 0..A.lastIndex) {
            str += (A[i].code xor 32).toChar()
        }

        return str
    }
}

