/*
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent,
with the colors in the order red, white, and blue. We will represent the colors as,
red -> 0
white -> 1
blue -> 2

Note: Using the library sort function is not allowed.
A = [0, 1, 2, 0, 1, 2]
output = [0, 0, 1, 1, 2, 2]
 */

class SortByColor {
    fun sortColors(A: IntArray): IntArray {
        return A.sortedWith(CompareColor()).toIntArray()
    }
}

class CompareColor : Comparator<Int> {
    override fun compare(e1: Int, e2: Int): Int {
        return e1 - e2
    }
}
