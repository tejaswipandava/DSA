class SquareRoot {
    fun solve(A: Int): Int {
        return isSquareRoot(A)
    }

    fun isSquareRoot(A: Int): Int {
        var i = 1
        while (i * i <= A) {
            if (i * i == A) return i
            i++
        }
        return -1
    }
}
