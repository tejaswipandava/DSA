class Prime {
    fun solve(A: Int): Int {
        return isBrutePrime(A)
        //return isPrime(A)
    }

    fun isBrutePrime(A: Int): Int {
        if (A == 1) return 0
        for (i in 2..A - 1) {
            if (A % i == 0) return 0
        }
        return 1
    }

    fun isPrime(A: Int): Int {
        return if (factors(A) == 2) 1 else 0
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
