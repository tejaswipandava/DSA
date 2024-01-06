/*
You are given the head of a linked list A and an integer B.
You need to find the B-th element of the linked list and return its value.

Note : Follow 0-based indexing for the node numbering.
 */

/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class KthElementLinkedList {
    fun solve(A: ListNode?, B: Int): Int {
        var cnt = 0
        var head = A
        while (head != null) {
            if (cnt == B) return head.`val`
            head = head.next
            cnt++
        }

        return -1
    }
}
