package Module_5.`16_Heaps`

import java.util.Collections
import java.util.PriorityQueue

class largest_element {

    fun sortBasic(A: Int, B: IntArray): IntArray {

        var heap = PriorityQueue<Int>()
        var result = IntArray(B.size)


        for (i in 0..A - 1) {
            heap.add(B[i])
            if (i < A - 2) result[i] = -1 else result[i] = heap.peek()
        }

        for (i in A - 1..B.lastIndex) {

            if (heap.peek() < B[i]) {
                heap.remove()
                heap.add(B[i])
            }

            result[i] = heap.peek()
        }

        return result
    }
}