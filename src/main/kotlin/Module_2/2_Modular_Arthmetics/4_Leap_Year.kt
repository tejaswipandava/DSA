/*
Given an integer A representing a year, Return 1 if it is a leap year else, return 0.
A year is a leap year if the following conditions are satisfied:

The year is multiple of 400.
or the year is multiple of 4 and not multiple of 100.
 */

class LeapYear {
    fun solve(A: Int): Int {

        return if (A % 400 == 0 || (A % 4 == 0 && A % 100 != 0)) 1 else 0
    }
}
