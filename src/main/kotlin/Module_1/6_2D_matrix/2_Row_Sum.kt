class RowSum {
    fun solve(A: Array<IntArray>): IntArray {

        var result = ArrayList<Int>()
        for (row in 0..A.lastIndex) {
            var sum = 0
            for (col in 0..A[0].lastIndex) {
                sum += A[row][col]
            }
            result.add(sum)
        }

        return result.toIntArray()
    }
}
