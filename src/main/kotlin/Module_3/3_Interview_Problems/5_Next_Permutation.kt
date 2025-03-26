/*
Implement the next permutation,
which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.
If such arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.

 A = [1, 2, 3]
Next permutaion of [1, 2, 3] will be [1, 3, 2].
*/

fun main() {
    var text = intArrayOf(412, 319, 695, 52)

    text.reverse(2, 3)
    println(text)
}

class NextPermutation {
    fun solve(A: IntArray): IntArray {

        // we are trying to find first decreasing number 3,4,1,2
        var pos = A.lastIndex
        for (i in A.lastIndex - 1 downTo 0) {
            if (A[i] > A[pos]) pos-- else break
        }

        //in case we dont have decreasing number basicall its like 3,2,1
        if (pos == 0) return A.reversed().toIntArray()

        //we have number as follows 158476531 and at 4 (4 < 7) we see decrease
        //so from 7 till end rearrange the nubmers in asc order
        A.sortDescending(pos, A.lastIndex)
        A.reverse()

        var e = A.lastIndex
        var s = pos
        while (s <= e) {
            var temp = A[s]
            A[s] = A[e]
            A[e] = temp
            s++
            e--
        }

        //now number is 158413567 and swap 4 to next greater number from its place till A.lastIndex
        for (i in pos..A.lastIndex) {
            if (A[pos - 1] < A[i]) {
                var temp = A[pos - 1]
                A[pos - 1] = A[i]
                A[i] = temp
                break
            }
        }
        return A
    }

    fun optimizePerMutation(A: IntArray): IntArray {

        // we are trying to find first decreasing number 3,4,1,2
        var pos = A.lastIndex - 1
        while (pos >= 0 && A[pos] >= A[pos + 1]) {
            pos--
        }

        //in case we dont have decreasing number basicall its like 3,2,1
        if (pos == -1) return A.reversedArray()


        //we have number as follows 158476531 and at 4 (4 < 7) we see decrease
        //so from 7 till end rearrange the nubmers in asc order
        A.sortDescending(pos + 1, A.size)
        A.reverse(pos + 1, A.size)


        //now number is 158413567 and swap 4 to next greater number from its place till A.lastIndex
        for (i in pos + 1..A.lastIndex) {
            if (A[pos] < A[i]) {
                var temp = A[pos]
                A[pos] = A[i]
                A[i] = temp
                break
            }
        }
        return A
    }
}
