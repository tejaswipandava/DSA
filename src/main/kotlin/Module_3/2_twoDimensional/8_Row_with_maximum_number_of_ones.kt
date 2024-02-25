/*
Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows + columns).

 A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]
Row 0 has maximum number of 1s.
 A = [   [0, 0, 0, 0]
         [0, 0, 0, 1]
         [0, 0, 1, 1]
         [0, 1, 1, 1]    ]
Row 3 has maximum number of 1s.
 */

class RowWithMaximumNumberOfOnes {
    fun solve(A: Array<IntArray>): Int {

        var maxCount = 0
        var maxRow = 0

        for (row in 0..A.lastIndex) {
            var sum = 0
            for (col in A[0].lastIndex downTo 0) {
                if (A[row][col] == 1) sum++ else break

                if (sum > maxCount) {
                    maxCount = sum
                    maxRow = row
                }
            }
        }

        return maxRow
    }
}
