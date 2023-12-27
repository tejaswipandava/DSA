/*
You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]
 */

class CountIncreasingTriplets {
    fun solve(A: IntArray): Int {

        var ans = 0
        for (i in 1..A.lastIndex - 1) {
            var small = findSmaller(A, i)
            var large = findlarger(A, i)

            ans += small * large
        }

        return ans
    }

    fun findSmaller(A: IntArray, index: Int): Int {
        var count = 0
        for (i in 0..index) {
            if (A[i] < A[index]) count++
        }

        return count
    }

    fun findlarger(A: IntArray, index: Int): Int {
        var count = 0
        for (i in index..A.lastIndex) {
            if (A[i] > A[index]) count++
        }

        return count
    }
}
