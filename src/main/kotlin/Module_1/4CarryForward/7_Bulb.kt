
/*
A wire connects N light bulbs.
Each bulb has a switch associated with it; however, due to faulty wiring,
a switch also changes the state of all the bulbs to the right of the current bulb.
Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
You can press the same switch multiple times.
Note: 0 represents the bulb is off and 1 represents the bulb is on.
 */

class BulbToggle {
    fun bulbs(A: IntArray): Int {
        var toggle = 0

        for (i in 0..A.lastIndex) {
            if (toggle % 2 == 0 && A[i] == 0) toggle++
            else if (toggle % 2 != 0 && A[i] == 1) toggle++
        }

        return toggle
    }

    fun bulbs2(A: IntArray): Int {

        var state = 0
        var ans = 0
        for (i in 0..A.lastIndex) {
            if (A[i] == state) {
                ans++
                state = 1 - state //used to toggle the state
            }
        }

        return ans
    }
}
