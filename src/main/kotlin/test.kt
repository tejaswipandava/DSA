class Solution {
    fun longestPalindrome(A: String): String {
        var result = ""
        for(i in 0..A.lastIndex){
            var pal = palindrome(A,i,i)
            if(pal.length > result.length) result = pal

            pal = palindrome(A,i,i+1)
            if(pal.length > result.length) result = pal
        }

        return result
    }

    fun palindrome(A: String, p1:Int,p2:Int):String{
        var p1 = p1
        var p2 = p2
        while(p1 >=0 && p2<=A.lastIndex && A[p1] == A[p2]){
            p1--
            p2++
        }

        return A.substring(p1+1,p2)
    }
}
