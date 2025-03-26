package Module_5.`14_Heaps`

class Heap {
    private fun parent(index: Int) = (index - 1) / 2
    private fun leftChild(index: Int) = 2 * index + 1
    private fun rightChild(index: Int) = 2 * index + 2

    private val list = mutableListOf<Int>()

    fun add(value: Int) {
        list.add(value)
        var c = list.lastIndex
        while (c > 0) {
            var p = parent(c)
            if (list[p] > list[c]) {
                swap(c, p)
                c = p
            } else {
                break
            }
        }
    }

    private fun swap(c: Int, p: Int) {
        var temp = list[c]
        list[c] = list[p]
        list[p] = list[c]
    }

    fun removePeak(): Int {
        swap(0, list[list.lastIndex])
        list.removeLast()
        heapify(0)
        return list[0]
    }

    fun heapify(index: Int) {
        var i = index
        var child = 2 * i + 1
        while (child < list.lastIndex) {
            var min = Math.min(Math.min(list[child], leftChild(child)), rightChild(child))
            if (list[child] == min) break
            else if (leftChild(child) == min) {
                swap(i, child)
                i = child
            } else if (rightChild(child) == min) {
                swap(i, child + 1)
                i = child + 1
            }
        }
    }
}