class PerfectNumber {
    fun solve(A: Int): Int {
        return if (isPerfectNumber(A) == A) 1 else 0
    }

    fun isPerfectNumber(A: Int): Int {
        var sum = 0

        for (i in 1..A - 1) {
            if (A % i == 0) sum += i
        }

        return sum
    }
}
