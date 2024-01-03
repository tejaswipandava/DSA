/*
You are given an integer A, print A to 1 using using recursion.

Note :- After printing all the numbers from A to 1, print a new line.
 */

class PrintAto1Function {
    fun solve(A: Int) {
        recursivePrint(A)
        println()
        return
    }

    fun recursivePrint(A: Int) {
        print("$A ")

        if (A == 1) return
        recursivePrint(A - 1)
    }
}
