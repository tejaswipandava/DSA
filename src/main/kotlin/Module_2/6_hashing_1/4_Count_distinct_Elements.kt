/*
Given an array A of N integers, return the number of unique elements in the array.
 */

class CountDistinctElements {
    fun solve(A: IntArray): Int {

        var hashset = HashSet<Int>()

        A.map { it -> hashset.add(it) }

        return hashset.size
    }
}
