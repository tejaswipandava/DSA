/*
There are A people standing in a circle.
Person 1 kills their immediate clockwise neighbour and pass the knife to the next person standing in circle.
This process continues till there is only 1 person remaining.
Find the last person standing in the circle.
 */

class JosephusProblem {
    fun solve(A: Int): Int {

        var pow2 = 1
        while (pow2 <= A) {
            pow2 *= 2
        }
        pow2 /= 2

        val requiredKills = A - pow2
        val startingPoint = requiredKills * 2 + 1 //position of the knife

        return startingPoint
    }
}
