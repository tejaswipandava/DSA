/*
You are given a singly linked list having head node A. You need to print the linked list in reverse order.

Note :- The node values must be space separated. You must give a newline after printing all the nodes.
 */

/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ReverseLinkedList {
    fun solve(A: ListNode?) {
        var curr = A
        var prev: ListNode? = null

        while (curr != null) {
            var future = curr.next
            curr.next = prev
            prev = curr
            curr = future
            //println("value of prev ${prev.`val`} and ${prev?.next?.`val`}")
        }

        while (prev != null) {
            print("${prev.`val`} ")
            prev = prev.next
        }
        println()
    }
}
