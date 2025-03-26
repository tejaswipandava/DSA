fun main() {

    var A = intArrayOf(6, 3, 3, 6, 7, 8, 7, 3, 7)
    Solution().evenNumberInRange(A, arrayOf(intArrayOf(2, 6)))
}

class Solution {

    fun countFactors(num: Int): Int {
        var count = 0;
        for (i in 1..num) {
            if (num % i == 0) count++
        }
        return count
    }

    fun countFactors2(num: Int): Int {
        var count = 0
        var i = 1
        while (i * i <= num) {
            if (i * i == num) count++ else if (num % i == 0) count += 2
            i++
        }

        return count
    }

    fun sqrt(num: Int): Int {
        var i = 1
        while (i * i <= num) {
            if (i * i == num) return i
            i++
        }
        return -1
    }

    fun findDivisorSum(num: Int): Int {
        var sum = 0
        var i = 1
        while (i * i <= num) {
            if (i * i == num) sum += i
            if (num % i == 0) {
                sum += i
                sum += num / i
            }
            i++
        }

        return sum - num
    }

    fun countPrimeNumber(num: Int): Int {
        var nArray = BooleanArray(num + 1)

        for (i in 2..num) {
            var prime = i
            var multiplier = 2
            if (!nArray[i]) {
                while (prime * multiplier <= num) {
                    var value = (prime * multiplier)
                    nArray[value] = true
                    multiplier++
                }
            }
        }

        var count = 0
        for (i in 2..num) {
            if (!nArray[i]) {
                count++
            }
        }

        return count
    }

    fun oneElementGreater(num: IntArray): Int {
        var max = num[0]
        var count = 0
        for (i in 0..num.lastIndex) {
            if (num[i] > max) {
                max = num[i]
            }
        }

        for (i in 0..num.lastIndex) {
            if (num[i] == max) {
                count++
            }
        }

        return num.size - count
    }

    fun reverse(A: IntArray, s: Int, e: Int) {
        var s = s
        var e = e
        while (s <= e) {
            var temp = A[s]
            A[s] = A[e]
            A[e] = temp
        }
    }

    fun rotateNTimes(num: IntArray, B: Int) {
        var B = B % num.size

        reverse(num, 0, num.lastIndex)
        reverse(num, 0, B - 1)
        reverse(num, B, num.lastIndex)
    }

    fun sumOfMaxMin(A: IntArray) {
        var max = A[0]
        var min = A[0]

        for (i in 0..A.lastIndex) {
            if (A[i] > max) max = A[i]
            if (A[i] < min) min = A[i]
        }
    }

    fun secondMax(A: IntArray): Int {
        var max = A[0]
        var secondMax = A[0]

        for (i in 0..A.lastIndex) {
            if (A[i] > max) {
                max = A[i]
                secondMax = max
            } else if (A[i] > secondMax && A[i] != max) {
                secondMax = A[i]
            }
        }

        return if (max != secondMax) secondMax else -1
    }

    fun maxElement(A: IntArray): Int {
        var max = A[0]

        for (i in 0..A.lastIndex) {
            if (A[i] > max) max = A[i]
        }

        return max
    }

    fun allElementToMaxDifference(A: IntArray): Int {
        var max = maxElement(A)
        var sum = 0

        for (i in 0..A.lastIndex) {
            sum = max - A[i]
        }

        return sum
    }

    fun rangeSumQuery(A: IntArray, B: Array<IntArray>): IntArray {
        var result = ArrayList<Int>()
        for (i in 1..A.lastIndex) {
            A[i] += A[i - 1]
        }

        for ((l, r) in B) {
            if (l == 0) {
                result.add(A[r])
            } else {
                result.add(A[r] - A[l - 1])
            }
        }

        return result.toIntArray()
    }

    fun equilibriumIndex(A: IntArray): Int {
        var result = 0
        for (i in 1..A.lastIndex) {
            A[i] += A[i - 1]
        }

        var left = 0
        var right = 0
        for (i in 0..A.lastIndex) {
            if (i == 0) left = 0 else left = A[i - 1]
            if (i == A.lastIndex) right = 0 else right = A[A.lastIndex] - A[i]

            if (left == right) return i
        }

        return -1
    }

    fun evenNumberInRange(A: IntArray, B: Array<IntArray>): IntArray {
        var pf = IntArray(A.size)
        var res = ArrayList<Int>()

        if (A[0] % 2 == 0) pf[0] = 1
        for (i in 1..A.lastIndex) {
            var result = if (A[i] % 2 == 0) 1 else 0
            pf[i] = pf[i - 1] + result
        }

        for ((l, r) in B) {
            if (l == 0) res.add(pf[r])
            else res.add(pf[r] - pf[l - 1])
        }

        return res.toIntArray()
    }

    fun arrayMultiply(A: IntArray): IntArray {
        var pf = IntArray(A.size)
        pf[0] = A[0]
        for (i in 1..A.lastIndex) {
            pf[i] = pf[i - 1] * A[i]
        }

        for (i in 0..A.lastIndex) {
            if (i == 0) A[i] = pf[A.lastIndex] / A[i]
            else if (i == A.lastIndex) A[i] = pf[A.lastIndex - 1]
            else A[i] = pf[A.lastIndex] / A[i]
        }

        return A
    }

    fun leadersInAnArray(A: IntArray): IntArray {
        var result = ArrayList<Int>()
        result.add(A[A.lastIndex])
        var max = A[A.lastIndex]

        for (i in A.lastIndex - 1 downTo 0) {
            if (A[i] > max) {
                max = A[i]
                result.add(A[i])
            }
        }

        return result.toIntArray()
    }

    fun maxMinSubArray(A: IntArray): Int {
        var result = A.size
        var max = A[0]
        var min = A[0]

        for (i in 0..A.lastIndex) {
            if (A[i] > max) max = A[i]
            if (A[i] < min) min = A[i]
        }

        var maxIndex = -1
        var minIndex = -1
        for (i in 0..A.lastIndex) {
            if (A[i] == max) maxIndex = i
            if (A[i] == min) minIndex = i
            if (minIndex != -1 && maxIndex != -1) {
                result = Math.min(result, Math.abs(maxIndex - minIndex) + 1)
            }
        }

        return result
    }

    fun sequenceAG(A: String): Int {
        var count = 0
        var result = 0
        var charArr = A.toCharArray()
        for (i in 0..charArr.lastIndex) {
            if (charArr[i] == 'A') count++
            if (charArr[i] == 'G') result += count
        }

        return result
    }

    fun buySellStock(A: IntArray): Int {
        var buy = A[0]
        var profit = 0
        for (i in 1..A.lastIndex) {
            if (A[i] < buy) buy = A[i]
            if (A[i] > buy) profit = Math.max(profit, A[i] - buy)
        }

        return profit
    }

    fun amazingSubString(A: String): Int {
        var char = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var c = A.toCharArray()
        var result = 0

        for (i in 0..c.lastIndex) {
            if (char.contains(c[i])) {
                result = (result + (c.lastIndex - i + 1))
            }
        }

        return result
    }

    fun continuousMaxSubArraySum(A: IntArray): Int {
        var sum = 0
        var result = Int.MIN_VALUE
        for (i in 0..A.lastIndex) {
            if (sum < 0) sum = 0
            sum += A[i]
            result = Math.max(result, sum)
        }

        return result
    }

    fun beggerOutsideTemple(A: Int, B: Array<IntArray>): IntArray {
        var beg = IntArray(A)

        for ((l, r, v) in B) {
            beg[l - 1] += v
            if (r != A) beg[r] -= v
        }

        for (i in 1..beg.lastIndex) {
            beg[i] += beg[i - 1]
        }

        return beg
    }

    fun RainWaterTrapped(A: IntArray): Int {
        var storage = 0
        var l = 0
        var r = A.lastIndex
        var lmax = 0
        var rmax = 0

        while (l < r) {
            if (A[l] <= A[r]) {
                if (A[l] > lmax) lmax = A[l] else storage += lmax - A[l]
                l++
            } else {
                if (A[r] > rmax) rmax = A[r] else storage += rmax - A[r]
                r--
            }
        }

        return storage
    }

    fun sumOfAllSubMatrix(A: Array<IntArray>): Int {
        var sum = 0

        for (i in 0..A.lastIndex) {
            for (j in 0..A[0].lastIndex) {
                sum += (i + 1) * (A.lastIndex - i) * (j + 1) * (A[0].lastIndex - j) * A[i][j]
            }
        }

        return sum
    }

    fun preFixMatrix(A: Array<IntArray>) {
        for (i in 1..A.lastIndex) {
            for (j in 0..A[0].lastIndex) {
                A[i][j] += A[i - 1][j]
            }
        }

        for (i in 0..A.lastIndex) {
            for (j in 1..A[0].lastIndex) {
                A[i][j] += A[i][j - 1]
            }
        }
    }

    fun subMatrixSumQueries(A: Array<IntArray>, B: IntArray, C: IntArray, D: IntArray, E: IntArray): IntArray {
        var result = ArrayList<Int>()

        var mod = (Math.pow(10.0, 9.0) + 7).toInt()
        preFixMatrix(A)
        for (i in 0..B.lastIndex) {
            var sum = 0
            var r1 = B[i] - 1
            var c1 = C[i] - 1
            var r2 = D[i] - 1
            var c2 = E[i] - 1

            var bottomRight = A[r2][c2]
            var bottomLeft = if (c1 != 0) -A[r2][c1 - 1] else 0
            var topright = if (r1 != 0) -A[r1 - 1][c2] else 0
            var topleft = if (r1 != 0 && c1 != 0) A[r1 - 1][c1 - 1] else 0

            sum = bottomLeft + bottomRight + topleft + topright

            while (sum < 0) sum += mod
            sum = sum % mod

            result.add(sum)
        }

        return result.toIntArray()
    }

    fun RowColWiseSOrtedSearch(A: Array<IntArray>, B: Int): Int {
        var i = 0
        var j = A[0].lastIndex
        var result = Int.MAX_VALUE

        while (i <= A.lastIndex && j >= 0) {
            if (A[i][j] == B) {
                result = Math.min(result, i * 1009 + j)
                j--
            } else if (A[i][j] > B) {
                i++
            } else if (A[i][j] < B) {
                j--
            }
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }


    fun mergeInterval(A: Array<IntArray>, B: IntArray): Array<IntArray> {
        var result = ArrayList<IntArray>()
        var nl = B[0]
        var nr = B[1]

        for (i in 0..A.lastIndex) {
            var l = A[i][0]
            var r = A[i][1]
            if (r < nl) result.add(A[i])
            else if (nr < l) {
                result.add(intArrayOf(nl, nr))
                for (j in i..A.lastIndex) {
                    result.add(A[j])
                }
            } else {
                nl = Math.min(nl, l)
                nr = Math.max(r, nr)
            }
        }

        return result.toTypedArray()
    }

    fun missingInteger(A: IntArray): Int {
        var i = 0
        var n = A.lastIndex
        while (i < n) {
            if (A[i] >= 1 && A[i] <= n) {
                if (A[i] != i + 1 && A[i] != A[i + 1]) {
                    var temp = A[i + 1]
                    A[i + 1] = A[i]
                    A[i] = temp
                } else i++
            } else i++
        }

        for (i in 0..A.lastIndex) {
            if (A[i] != i + 1) return i + 1
        }

        return n + 1
    }

}
