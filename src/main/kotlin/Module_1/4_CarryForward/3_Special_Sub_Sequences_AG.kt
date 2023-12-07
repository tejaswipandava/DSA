/*
You have given a string A having Uppercase English letters.
You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
 */

class AGSubSequences {
    fun solve(A: String): Long {
        var ACount = 0L
        var result = 0L

        for(i in 0..A.lastIndex){
            if(A[i] == 'A') ACount++

            if(A[i] == 'G') result += ACount
        }

        return result
    }
}
