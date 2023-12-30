/*
First argument A is an array of integers.
Second argument B is an array of integers denoting the queries.
 */

class FrequencyOfElements {
    fun solve(A: IntArray, B: IntArray): IntArray {
        var hm = HashMap<Int, Int>()
        var result = ArrayList<Int>()

        for (ele in A) {
            hm[ele] = hm[ele]?.plus(1) ?: 1
        }

        for (ele in B) {
            var element = hm[ele] ?: 0
            result.add(element)
        }

        return result.toIntArray()
    }

    fun solve2(A: IntArray, B: IntArray): IntArray {
        var hashmap = HashMap<Int, Int>()

        A.forEach { it ->
            //hashmap[it] = 1 //assignment or adding of keys
            //hashmap[it] = hashmap.getOrDefault(it,0) //returns the value if key exists else 0
            hashmap[it] = hashmap.getOrDefault(it, 0) + 1
        }

        var result = B.map { it -> hashmap.getOrDefault(it, 0) }.toIntArray()

        return result
    }
}
