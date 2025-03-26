package Module_5.Greedy

import EquilibriumIndex

/*
N children are standing in a line. Each child is assigned a rating value.
You are giving candies to these children subjected to the following requirements:
Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum number of candies you must give?
Input 1:
A = [1, 2]
o/p 3
Input 2:
A = [1, 5, 2, 1]
o/p 7
 */
class Distribute_Candy {

    fun candy(A: IntArray): Int {
        var sum = 0
        var result = IntArray(A.size) { 1 }
        var l = leftToRight(A, result)
        var r = rightToLeft(A, result)

        for (ele in result) sum += ele
        return sum

    }

    fun leftToRight(A: IntArray, result: IntArray) {
        for (i in 1..A.lastIndex) {
            if (A[i] > A[i - 1]) result[i] = result[i - 1] + 1
        }
    }

    fun rightToLeft(A: IntArray, result: IntArray) {
        for (i in A.lastIndex - 1 downTo 0) {
            if (A[i] > A[i + 1] && result[i] <= result[i + 1])
                result[i] = result[i + 1] + 1
        }
    }

    fun candyDistribution(A: IntArray): Int {
        var sum = 0
        for (i in 0..A.lastIndex) {
            var l = getLeftDecreasing(A, i)
            var r = getRightDecreasing(A, i)
            sum += (Math.max(l, r) + 1)
        }

        return sum
    }

    fun getLeftDecreasing(A: IntArray, index: Int): Int {
        var count = 0
        if (index == 0) return 0
        for (i in index downTo 1) {
            if (A[i] > A[i - 1]) count++
            else break
        }
        return count
    }

    fun getRightDecreasing(A: IntArray, index: Int): Int {
        var count = 0
        if (index == A.lastIndex) return 0
        for (i in index..A.lastIndex - 1) {
            if (A[i] > A[i + 1]) count++
            else break
        }
        return count
    }
}