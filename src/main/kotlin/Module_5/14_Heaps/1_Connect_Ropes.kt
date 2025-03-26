package Module_5.`14_Heaps`

import java.util.PriorityQueue

/*
You are given an array A of integers that represent the lengths of ropes.
You need to connect these ropes into one rope. The cost of joining two ropes equals the sum of their lengths.
Find and return the minimum cost to connect these ropes into one rope.
1 <= length of the array <= 100000
1 <= A[i] <= 1000

 A = [1, 2, 3, 4, 5]
 o/p 33
 A = [5, 17, 100, 11]
o/p 182
 */
class connectRopes {
    fun ropes(A: IntArray): Int {
        var heap = PriorityQueue<Int>()
        var sum = 0

//      heap.addAll(A.toList())
        for (i in 0..A.lastIndex) {
            heap.add(A[i])
        }

        while (heap.size > 1) {
            var a = heap.remove()
            var b = heap.remove()
            // println(heap)
            // println("value of a = $a  value of b= $b  value of sum = $sum")

            sum += a + b
            heap.add(a+b)
        }

        return sum
    }
}