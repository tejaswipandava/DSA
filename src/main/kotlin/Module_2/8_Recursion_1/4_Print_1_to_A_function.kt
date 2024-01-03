/*
You are given an integer A, print 1 to A using using recursion.

Note :- After printing all the numbers from 1 to A, print a new line.
 */

class Print1toAFunction {
    fun solve(A: Int) {

        recursivePrint(A)
        println()
    }

    fun recursivePrint(A: Int) {
        if (A > 1) {
            recursivePrint(A - 1)
        }

        print("${A} ")
    }
}
