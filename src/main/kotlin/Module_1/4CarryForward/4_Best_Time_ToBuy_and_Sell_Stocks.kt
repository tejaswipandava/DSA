/*
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction
(ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Return the maximum possible profit.
 */

class BuyAndSellStocks {
    fun maxProfit(A: IntArray): Int {
        if (A.size == 0) return 0

        var stock = A[0]
        var profit = 0

        for (i in 0..A.lastIndex) {
            if (A[i] < stock) stock = A[i]
            if (A[i] > stock) profit = Math.max(profit, A[i] - stock)
        }

        return profit
    }
}
