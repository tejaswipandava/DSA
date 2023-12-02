class CountPrime {
    fun solve(A: Int): Int {
        var count = 0
        for (i in 1..A) {
            if (isPrime(i)) count++
        }
        return count
    }

    fun isPrime(A: Int): Boolean {
        return if (factors(A) == 2) true else false
    }

    fun factors(A: Int): Int {
        var count = 0
        var i = 1
        while (i * i <= A) {
            if (i * i == A) count++
            else if (A % i == 0) count += 2
            i++
        }
        return count
    }
}
