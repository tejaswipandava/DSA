package Module_5.`16_Heaps`

import java.util.PriorityQueue

/*
N people having different priorities are standing in a queue.
The queue follows the property that each person is standing
at most B places away from its position in the sorted queue.
Your task is to sort the queue in the increasing order of priorities.
NOTE:
No two persons can have the same priority.
Use the property of the queue to sort the queue with complexity O(NlogB).

1 <= N <= 100000
0 <= B <= N

 A = [1, 40, 2, 3]
 B = 2
o/p [1, 2, 3, 40]
 A = [2, 1, 17, 10, 21, 95]
 B = 1
 o/p [1, 2, 10, 17, 21, 95]
 */
class K_Place_Apart {
    fun sortBasic(A: IntArray, B: Int): IntArray {
        return A.sortedArray()
    }

    fun sortQueue(A: IntArray, B: Int): IntArray {
        var result = ArrayList<Int>()
        var heap = PriorityQueue<Int>()
        for (ele in A) {
            heap.add(ele)
        }

        while (heap.peek() != null) {
            result.add(heap.remove())
        }
        return result.toIntArray()
    }
}