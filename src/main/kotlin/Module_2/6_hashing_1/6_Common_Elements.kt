/*
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:
Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.
 */

class CommonElements {
    // Do not write code to include libraries, main() function or accept any input from the console.
    // Initialization code is already written and hidden from you. Do not write code for it again.
    fun solve(A: IntArray, B: IntArray): IntArray {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        var result = ArrayList<Int>()
        var hm = HashMap<Int, Int>()

        for (ele in A) {
            hm[ele] = hm[ele]?.plus(1) ?: 1
        }

        for (ele in B) {
            if (hm.contains(ele)) {
                result.add(ele)
                hm[ele] = hm[ele]!!.minus(1)
                if (hm[ele]!! <= 0) hm.remove(ele)
            }
        }

        return result.toIntArray()

    }
}
