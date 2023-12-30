/*
Given a number A, find if it is COLORFUL number or not.
If number A is a COLORFUL number return 1 else, return 0.
What is a COLORFUL Number:

A number can be broken into different consecutive sequence of digits.
The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245.
This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
 */

class ColorfulNumber {
    fun colorful(A: Int): Int {
        var arr = ArrayList<Int>()
        var hs = HashSet<Int>()
        var num = A

        while (num > 0) {
            var rem = num % 10
            num /= 10

            arr.add(rem)
        }

        arr.reversed()


        for (i in 1..arr.lastIndex) {
            if (arr[i] == 0) arr[i] = arr[i - 1]
            else arr[i] = arr[i] * arr[i - 1]
        }

        for (l in 0..arr.lastIndex) {
            for (r in l..arr.lastIndex) {
                if (l == 0) {
                    if (hs.contains(arr[r])) return 0
                    else hs.add(arr[r])
                } else {
                    var num = arr[r] / arr[l - 1]
                    if (hs.contains(num)) return 0
                    else hs.add(num)
                }
            }
        }

        return 1


    }
}

