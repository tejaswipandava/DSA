class CountFactor {
    fun solve(A: Int): Int {
        //return bruteFactor(A)
        return optimalFactor(A)

    }

    fun bruteFactor(A: Int): Int {
        var count = 0
        for (i in 1..A) {
            if (A % i == 0) count++
        }

        return count
    }

    fun optimalFactor(A: Int): Int {
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
