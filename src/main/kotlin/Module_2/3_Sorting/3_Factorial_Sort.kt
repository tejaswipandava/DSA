/*
You are given an array A of N elements.
Sort the given array in increasing order of number of distinct factors of each element, i.e.,
element having the least number of factors should be the first to be displayed and
the number having highest number of factors should be the last one.
If 2 elements have same number of factors, then number with less value should come first.

Note: You cannot use any extra space
 */
class FactorialSort {
    fun solve(A: IntArray): IntArray {
        return A.sortedWith(CompareFactorial()).toIntArray()
    }

    fun countFact(num: Int): Int {
        var count = 0
        var num = num
        var i = 1
        while (i * i <= num) {
            if (i * i == num) count++
            else if (num % i == 0) count += 2
            i++
        }
        return count
    }
}

class CompareFactorial : Comparator<Int> {
    override fun compare(ele1: Int, ele2: Int): Int {
        val ef1 = FactorialSort().countFact(ele1)
        val ef2 = FactorialSort().countFact(ele2)

        return if (ef1 != ef2) ef1 - ef2 else ele1 - ele2
    }
}
