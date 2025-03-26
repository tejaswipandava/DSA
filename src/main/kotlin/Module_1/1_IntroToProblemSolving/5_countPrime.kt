class CountPrime {
    fun solve(A: Int): Int {
//        var count = 0
//        for (i in 1..A) {
//            if (isPrime(i)) count++
//        }
//        return count

        //Eratosthenes approach
        return countPrimeNumber(A)
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

    fun countPrimeNumber(num: Int): Int {
        var nArray = BooleanArray(num + 1)

        for (i in 2..num) {
            var prime = i
            var multiplier = 2
            if (!nArray[i]) {
                while (prime * multiplier <= num) {
                    var value = (prime * multiplier)
                    nArray[value] = true
                    multiplier++
                }
            }
        }

        var count = 0
        for (i in 2..num) {
            if (!nArray[i]) {
                count++
            }
        }

        return count
    }
}
