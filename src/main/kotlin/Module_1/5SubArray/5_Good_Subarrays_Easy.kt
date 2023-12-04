


/*
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
 */
class GoodSubarraysEasy {
    fun solve(A: IntArray, B: Int): Int {
        var result = 0

        for( start in 0..A.lastIndex){
            var sum = 0
            for(end in start ..A.lastIndex){
                sum = sum + A[end]
                if((end - start + 1)%2 == 0 && sum <B) result++
                else if((end-start+1)%2 != 0 && sum >B) result++
            }
        }

        return result
    }
}
