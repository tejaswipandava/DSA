package Module_5.`14_Heaps`

import java.util.Collections
import java.util.PriorityQueue

class Magician_and_Chocolates {
    fun getChocolates(A: Int, B: IntArray): Int {
        var mod = Math.pow(10.0, 9.0) + 7
        var heap = PriorityQueue<Int>(Collections.reverseOrder())
        heap.addAll(B.toList())

        var sum = 0

        for (i in 0..A - 1) {
            var maxValue = heap.remove()
            sum = (sum % mod + maxValue % mod).toInt()
            heap.add(maxValue / 2)
        }

        return (sum % mod).toInt()
    }
}