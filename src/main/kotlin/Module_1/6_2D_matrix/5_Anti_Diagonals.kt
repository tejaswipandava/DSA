/*
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
input
1 2 3
4 5 6
7 8 9
output
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
 */


class AntiDiagonals {
    fun diagonal(A: Array<IntArray>): Array<IntArray> {
        var result = ArrayList<IntArray>()

        for (col in 0..A.lastIndex) {
            var col = col
            var row = 0
            var arr = IntArray(A.size) { 0 }
            while (row <= A.lastIndex && col >= 0) {
                arr[row] = A[row][col]
                row++
                col--
            }
            result.add(arr)
        }

        for (row in 1..A.lastIndex) {
            var row = row
            var col = A.lastIndex
            var arr = IntArray(A.size) { 0 }
            var index = 0
            while (row <= A.lastIndex && col >= 0) {
                arr[index] = A[row][col]
                row++
                col--
                index++
            }
            result.add(arr)
        }

        return result.toTypedArray()
    }
}
