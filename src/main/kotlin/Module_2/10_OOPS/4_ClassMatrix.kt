/*
Construct a class called Matrix which stores a 2D Array. It should store

The number of rows

The number of columns

The 2D Array itself

Implement the following functionalities inside this class :-

input() -> Reads the input from the user. This method should read the input from the user and populate the entire array. Each row will be in a new line and all the elements in a row will be space-separated.

add(Matrix) -> Returns the sum of two matrices. Assume the matrices provided have the same dimensions.

subtract(Matrix) -> Returns the sum of two matrices. Assume the matrices provided have the same dimensions.

transpose() -> Returns a new matrix containing the transpose of the given original matrix.

print() -> prints the entire matrix row by row. Each row will be in a new line and values in each row should be separated by a single space.

You may define any properties in the class as you see appropriate.
 */

class Matrix(var row: Int, var col: Int) {

    var arr = Array(row) { it -> IntArray(col) }
    fun input() {
        println("Please enter the values")
        for (r in 0..row - 1) {
            for (c in 0..col - 1) {
                var input = readln()
                arr[r][c] = input.toInt()
            }
        }
    }

    fun print() {
        for (r in 0..row - 1) {
            println(arr[r].joinToString(" "))
        }
    }

    fun add(x: Matrix): Matrix {
        var mat = Matrix(row, col)

        for (r in 0..row - 1) {
            for (c in 0..col - 1) {
                mat.arr[r][c] = arr[r][c] + x.arr[r][c]
            }
        }

        return mat
    }

    fun subtract(x: Matrix): Matrix {
        var mat = Matrix(row, col)

        for (r in 0..row - 1) {
            for (c in 0..col - 1) {
                mat.arr[r][c] = arr[r][c] - x.arr[r][c]
            }
        }

        return mat
    }

    fun transpose(): Matrix {
        var mat = Matrix(col, row)

        for (r in 0..row - 1) {
            for (c in r..col - 1) {
                mat.arr[c][r] = arr[r][c]
            }
        }

        return mat
    }
}

