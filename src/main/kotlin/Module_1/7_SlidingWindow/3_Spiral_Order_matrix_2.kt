/*
Given an integer A,
generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.

input = 5
output
[ [1,   2,  3,  4, 5],
  [16, 17, 18, 19, 6],
  [15, 24, 25, 20, 7],
  [14, 23, 22, 21, 8],
  [13, 12, 11, 10, 9] ]
 */

class SpiralOrderMatrix2 {
    fun generateMatrix(A: Int): Array<IntArray> {
        var arr = Array(A) { IntArray(A) { 0 } }
        var n = A - 1
        var value = 1

        var x = 0
        var y = 0

        while (n > 0) {
            //left to right
            for (k in 0..n - 1) {
                arr[x][y] = value
                value++
                y++
            }

            //top to bottom
            for (k in 0..n - 1) {
                arr[x][y] = value
                value++
                x++
            }

            //left to right
            for (k in 0..n - 1) {
                arr[x][y] = value
                value++
                y--
            }

            //bottom to top
            for (k in 0..n - 1) {
                arr[x][y] = value
                value++
                x--
            }

            n -= 2
            x++
            y++
        }

        if (n == 0) arr[x][y] = value

        return arr
    }
}
