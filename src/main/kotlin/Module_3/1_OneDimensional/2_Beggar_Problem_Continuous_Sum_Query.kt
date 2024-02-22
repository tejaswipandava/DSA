/*
There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot.
When the devotees come to the temple, they donate some amount of coins to these beggars.
Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index,
where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day,
provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B

A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

output
10 55 45 25 25
 */
class BeggarProblem {
    fun solve(A: Int, B: Array<IntArray>): IntArray {
        var beggars = IntArray(A) { 0 }

        for ((l, r, value) in B) {
            beggars[l - 1] += value
            if (r < A) beggars[r] -= value
        }

        for (k in 1..beggars.lastIndex) {
            beggars[k] += beggars[k - 1]
        }

        return beggars
    }
}
