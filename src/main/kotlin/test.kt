class Solution {
    fun solve(A: IntArray): IntArray {
        var B = A.sortedWith(customComporator())
        return B.toIntArray()
    }

    fun comparator(): Comparator<Int> = Comparator { ele1, ele2 ->
        var ele1Factor = countFactors(ele1)
        var ele2Factor = countFactors(ele2)

        // if (ele1Factor > ele2Factor) 1 //it means it prefers smaller value
        // else if (ele1Factor < ele2Factor) -1 //it means ele1 is bigger
        // else {
        //     if (ele1 > ele2) 1 else -1
        // }

        if (ele1Factor == ele2Factor) {
            ele1 - ele2 //-ve means it will take smaller value
        } else {
            ele1Factor - ele2Factor //-ve means it will take smaller value
        }
    }

    public fun countFactors(ele: Int): Int {
        var count = 0
        var i = 1

        while (i * i <= ele) {
            if (ele % i == 0) {
                if (ele / i == i) count++
                else count += 2
            }
            i++
        }

        return count
    }
}

class customComporator : Comparator<Int> {
    override fun compare(ele1: Int, ele2: Int): Int {
        var ele1Factor = Solution().countFactors(ele1)
        var ele2Factor = Solution().countFactors(ele2)

        //-ve value means ele1 is smaller
        //+ve value means ele2 is smaller
        //0 means both are equal
        return if (ele1Factor == ele2Factor) {
            ele1 - ele2
        } else {
            ele1Factor - ele2Factor
        }
    }
}
