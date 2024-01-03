/*
Write a recursive function that takes a string, S, as input and prints the characters of S in reverse order.
 */

import java.util.*

fun main(args: Array<String>) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    var str = readln()
    reverse(str, str.lastIndex)
}

fun reverse(str: String, idx: Int) {
    if (idx < 0) return
    print(str[idx])
    return reverse(str, idx - 1)
}
