/*
Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
 */

class CheckPairSum {
    fun solve(A: Int, B: IntArray): Int {

        var hs = HashSet<Int>()
        for (ele in B) {
            var value = A - ele
            if (hs.contains(value)) return 1
            else hs.add(ele)
        }

        return 0
    }
}
