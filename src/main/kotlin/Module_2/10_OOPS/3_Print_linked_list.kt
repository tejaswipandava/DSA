/*
You are given A which is the head of a linked list. Print the linked list in space separated manner.

Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line
 */


// Definition for singly-linked list.
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class LinkedList {
    fun solve(A: ListNode?) {

        var head = A

        while (head != null) {
            print("${head.`val`} ")
            head = head.next
        }

        println()
        return
    }
}
